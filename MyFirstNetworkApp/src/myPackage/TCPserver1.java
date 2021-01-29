package myPackage;
import java.io.*;
import java.net.*;

public class TCPserver1 {
	public static void main(String[] args) throws IOException{
		String clientSentence;
		String capitalizedSentence;
		
		ServerSocket welcomeSocket;
		welcomeSocket = new ServerSocket(6789);
		
		System.out.println("Server start..\n");
		while(true) {
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			clientSentence = inFromClient.readLine();
			System.out.println("FROM CLIENT: " + clientSentence );
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			outToClient.writeBytes(capitalizedSentence);
			
		}
	}
}
