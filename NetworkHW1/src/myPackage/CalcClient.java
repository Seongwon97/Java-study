package myPackage;
import java.io.*;
import java.net.*;
import java.util.*;
public class CalcClient {
	static String ipAddress = null;
	static int portNum = 0;
	public static void main(String[] args) {
		String fileName = "serverinfo.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName)); 
			//Open the serverinfo.text file in scanner format.
		}catch(FileNotFoundException e) {
			//If no file is found, the ipaddress is localhost and the portnum is 9999.
			ipAddress="localhost";
			portNum=9999;
			e.printStackTrace();
		}
	    while (inputStream.hasNext()) {
	         ipAddress = inputStream.next();
	         portNum = inputStream.nextInt();
	    }//As the thread is created, ipAddress and portNum are read from the file.
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket(ipAddress, portNum);//Create a new socket
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			System.out.println("Arithmetic: add, minus, multifly, divide");
			while (true) {
				System.out.print("Formula(Please enter a space to enter,example : ADD 24 42)"+"\n>>"); //Prompt
				String outputMessage = scanner.nextLine(); //Read formula on keyboard
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n"); //Send "bye" string
					out.flush();
					break; //If the user typed "bye", the connection is terminated after sending to the server
				}
				out.write(outputMessage + "\n"); //Send formula string read from keyboard
				out.flush();
				String inputMessage = in.readLine(); //Receive calculation results from the server
				System.out.println("Result: " + inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close(); //Close client socket
			} catch (IOException e) {
				System.out.println("An error occurred while chatting with the server.");
			}
		}
	}
}