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
    JTextField textField = new JTextField(50);//textField��� ���ο� �ʵ� ����
    JTextArea messageArea = new JTextArea(16, 50);
    JButton button = new JButton("Whisper");//Whisper ��ư ����
    String name;
    String temp;
    boolean onOff=false;//whisper mode�� on,off�� �˰� ���ִ� ������ �����.


    /**
     * Constructs the client by laying out the GUI and registering a listener with the
     * textfield so that pressing Return in the listener sends the textfield contents
     * to the server. Note however that the textfield is initially NOT editable, and
     * only becomes editable AFTER the client receives the NAMEACCEPTED message from
     * the server.
     */
    public boolean whisper(String a) {//�Է¹��� ���ڿ��� <~/>�� �ִ��� �Ǻ��Ͽ� �ӼӸ��� �Ϸ��� �õ��Ͽ����� �Ǻ��Ѵ�.
        if(a.contains("<")&&a.contains("/>"))
           return true;
        else
           return false;
    }
    public ChatClient(String serverAddress) {//chat clientâ�� ����
        this.serverAddress = serverAddress;

        textField.setEditable(false);//textField�� ���� ���ϰ� ����
        messageArea.setEditable(false);//messageArea�� ������ϰ� ����
        frame.getContentPane().add(textField,BorderLayout.NORTH);
        //TextField Layout�� ��ܿ� ��ġ�Ѵ�.
        frame.getContentPane().add(new JScrollPane(messageArea), BorderLayout.CENTER);
        //content�� Ŭ ��� ��ũ���� ������ش�.
        frame.getContentPane().add(button,BorderLayout.SOUTH);
        //button�ϴܺο� ����
        frame.pack();

        // Send on enter then clear to prepare for next message
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	temp = textField.getText();
            	if(whisper(temp)==true) {//���ڿ��� <~/>�� �ִ��� �Ǻ�
            		if(onOff==true)//whisper mode�� �����ִ°�� message������.
            			out.println(temp);
            		else//whisper mode�� �����ִ°�� �����޼��� ���
            			messageArea.append("Error: Whisper mode Off.\n");
            	}
            	else {
            		out.println(temp);
            	}
                textField.setText("");
            }//textfield�� action event����
        });
        button.addActionListener(new ActionListener() {
        	//��ư�� ������� whisper mode�� on,off�ȴ�.
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


    private String getName() {//�̸��� �޴� â�� ����ش�.
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
                    }//���ڿ��� �ڽ��� �̸��� �ִ� ��쿡�� ����Ѵ�. 
                }
            }
        } finally {
            frame.setVisible(false);
            frame.dispose();
        }
    }

    public static void main(String[] args) throws Exception {
        
        ChatClient client = new ChatClient("127.0.0.1");//ip�ּҸ� Localhost��ȣ�� �����Ѵ�
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����ڰ� â�� ������ ����
        client.frame.setVisible(true);
        client.run();
    }
}
