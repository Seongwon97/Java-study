package myPackage;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CalcServer {
	static String ipAddress = null;
	static int portNum = 0;

	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if (st.countTokens() > 3) return "sematic1";
		//If st.countTokens is greater than 3, export sematic1.
		if (st.countTokens() < 3) return "sematic2";
		//If st.countTokens is less than 3, export sematic1.
		String res="";
		String opcode = st.nextToken();
		int op1 = Integer.parseInt(st.nextToken());
		int op2 = Integer.parseInt(st.nextToken());
		if(opcode.equalsIgnoreCase("add"))
			res = Integer.toString(op1 + op2);
		else if(opcode.equalsIgnoreCase("minus"))
			res = Integer.toString(op1 - op2);
		else if(opcode.equalsIgnoreCase("multifly"))
			res = Integer.toString(op1 * op2);
		else if(opcode.equalsIgnoreCase("divide")) {
			if(op2 == 0) return "sematic3";
			//If op2 is 0, export sematic3.
			res = Integer.toString(op1 / op2);
		}
		else
			res="sematic4";
		//In all other cases, returns sematic4
	return res;
	}

	public static void main(String[] args) throws Exception{

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
	    }//As the thread is created, ipaddress and portnum are read from the file.
		ServerSocket listener = null;
		Socket socket = null;
		listener = new ServerSocket(portNum); //Create server socket
		System.out.println("Waiting for connection.....");
		ExecutorService pool = Executors.newFixedThreadPool(20);
		//Allow 20 threadpools to be created
		while(true) {
			socket = listener.accept();//Wait for connection request from client
			System.out.println("Connected.");
			pool.execute(new Calculator(socket));
			//Execute new thread 
		}
	}
	
	private static class Calculator implements Runnable{
		//the thread has no return value
		private Socket socket;

		Calculator(Socket socket){
			this.socket = socket;
		}


		@Override
		public void run() {//Create a job to pass to the thread
			// TODO Auto-generated method stub
			BufferedReader in = null;
			BufferedWriter out = null;
			try {

				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				while (true) {
					String inputMessage = in.readLine();
					if (inputMessage.equalsIgnoreCase("bye")) {
						System.out.println("The client has terminated the connection");
						break; // Terminate connection when receiving "bye"
					}
					System.out.println(inputMessage); //Print received message on screen
					String res = calc(inputMessage); //Calculation. Calculation result is res
					//Receive sematics and print the corresponding error.
					if(res.equalsIgnoreCase("sematic1")) 
						out.write("Incorrect: Too many arguments\n");
					else if(res.equalsIgnoreCase("sematic2")) 
						out.write("Incorrect: Too less arguments\n");
					else if(res.equalsIgnoreCase("sematic3"))
						out.write("Incorrect: divided by zero\n");
					else if(res.equalsIgnoreCase("sematic4")) 
						out.write("Incorrect: arithmetic is wrong\n");
					else
						out.write(res + "\n");
					/*If no sematics are received, the result is the correct one 
					and the result of the calculation is printed.*/
					out.flush();//Send calculation result string
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if(socket != null) socket.close(); //Close communication socket
				} catch (IOException e) {
					System.out.println("An error occurred while chatting with the client.");
				}
			}
		}	
	}
}
