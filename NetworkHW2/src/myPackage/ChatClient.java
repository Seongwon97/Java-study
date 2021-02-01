package myPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.Socket;
import java.util.Scanner;

import static java.awt.BorderLayout.NORTH;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.*;
import javax.swing.*;


/**
 * A simple Swing-based client for the chat server. Graphically it is a frame with a text
 * field for entering messages and a textarea to see the whole dialog.
 *
 * The client follows the following Chat Protocol. When the server sends "SUBMITNAME" the
 * client replies with the desired screen name. The server will keep sending "SUBMITNAME"
 * requests as long as the client submits screen names that are already in use. When the
 * server sends a line beginning with "NAMEACCEPTED" the client is now allowed to start
 * sending the server arbitrary strings to be broadcast to all chatters connected to the
 * server. When the server sends a line beginning with "MESSAGE" then all characters
 * following this string should be displayed in its message area.
 */
public class ChatClient {

    String serverAddress;
    Scanner in;
    PrintWriter out;
    JFrame frame = new JFrame("Chatter");
    JTextField textField = new JTextField(50);//textField라는 새로운 필드 생성
    JTextArea messageArea = new JTextArea(16, 50);
    JButton button = new JButton("Whisper");//Whisper 버튼 생성
    String name;
    String temp;
    boolean onOff=false;//whisper mode의 on,off를 알게 해주는 변수를 만든다.


    /**
     * Constructs the client by laying out the GUI and registering a listener with the
     * textfield so that pressing Return in the listener sends the textfield contents
     * to the server. Note however that the textfield is initially NOT editable, and
     * only becomes editable AFTER the client receives the NAMEACCEPTED message from
     * the server.
     */
    public boolean whisper(String a) {//입력받은 문자열에 <~/>가 있는지 판별하여 귓속말을 하려고 시도하였는지 판별한다.
        if(a.contains("<")&&a.contains("/>"))
           return true;
        else
           return false;
    }
    public ChatClient(String serverAddress) {//chat client창을 생성
        this.serverAddress = serverAddress;

        textField.setEditable(false);//textField를 변경 못하게 지정
        messageArea.setEditable(false);//messageArea를 변경못하게 지정
        frame.getContentPane().add(textField,BorderLayout.NORTH);
        //TextField Layout을 상단에 배치한다.
        frame.getContentPane().add(new JScrollPane(messageArea), BorderLayout.CENTER);
        //content가 클 경우 스크롤을 만들어준다.
        frame.getContentPane().add(button,BorderLayout.SOUTH);
        //button하단부에 생성
        frame.pack();

        // Send on enter then clear to prepare for next message
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	temp = textField.getText();
            	if(whisper(temp)==true) {//문자열에 <~/>이 있는지 판별
            		if(onOff==true)//whisper mode가 켜져있는경우 message보낸다.
            			out.println(temp);
            		else//whisper mode가 꺼져있는경우 에러메세지 출력
            			messageArea.append("Error: Whisper mode Off.\n");
            	}
            	else {
            		out.println(temp);
            	}
                textField.setText("");
            }//textfield에 action event지정
        });
        button.addActionListener(new ActionListener() {
        	//버튼을 누를경우 whisper mode가 on,off된다.
            public void actionPerformed(ActionEvent e) {
                if(onOff==false) {
                	messageArea.append("Whisper mode On.\n");
                	onOff=true;
                }
                else if(onOff==true) {
                	messageArea.append("Whisper mode Off.\n");
                	onOff=false;
                }
            }
        });
    }


    private String getName() {//이름을 받는 창을 띄워준다.
        return JOptionPane.showInputDialog(
            frame,
            "Choose a screen name:",
            "Screen name selection",
            JOptionPane.PLAIN_MESSAGE
        );
    }

    private void run() throws IOException {
        try {
        	Socket socket = new Socket(serverAddress, 59001);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(), true);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (line.startsWith("SUBMITNAME")) {
                	name=getName();
                    out.println(name);
                }
                else if (line.startsWith("NAMEACCEPTED")) {
                    this.frame.setTitle("Chatter - " + line.substring(13));
                    textField.setEditable(true); 
                }
                else if (line.startsWith("MESSAGE")) {
                    messageArea.append(line.substring(8) + "\n");
                }
                else if (line.startsWith("WHISPER")) {
                    if (line.substring(8).contains("<"+name+"/>") == true) {
                       messageArea.append(line.substring(8) + "\n");
                    }//문자열에 자신의 이름이 있는 경우에만 출력한다. 
                }
            }
        } finally {
            frame.setVisible(false);
            frame.dispose();
        }
    }

    public static void main(String[] args) throws Exception {
        
        ChatClient client = new ChatClient("127.0.0.1");//ip주소를 Localhost번호로 접속한다
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//사용자가 창을 닫을때 설정
        client.frame.setVisible(true);
        client.run();
    }
}
