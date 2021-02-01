package myPackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A multithreaded chat room server. When a client connects the server requests a screen
 * name by sending the client the text "SUBMITNAME", and keeps requesting a name until
 * a unique one is received. After a client submits a unique name, the server acknowledges
 * with "NAMEACCEPTED". Then all messages from that client will be broadcast to all other
 * clients that have submitted a unique screen name. The broadcast messages are prefixed
 * with "MESSAGE".
 *
 * This is just a teaching example so it can be enhanced in many ways, e.g., better
 * logging. Another is to accept a lot of fun commands, like Slack.
 */
public class ChatServer {

	// All client names, so we can check for duplicates upon registration.
	private static Set<String> names = new HashSet<>();

	// The set of all the print writers for all the clients, used for broadcast.
	private static Set<PrintWriter> writers = new HashSet<>();

	public static void main(String[] args) throws Exception {
		System.out.println("The chat server is running...");
		ExecutorService pool = Executors.newFixedThreadPool(500);//500개의 thread pool생성
		try (ServerSocket listener = new ServerSocket(59001)) {//59001포트에 서버소캣 생성
			while (true) {
				pool.execute(new Handler(listener.accept()));
			}
		}
	}

	/**
	 * The client handler task.
	 */
	private static class Handler implements Runnable {
		private String name;
		private Socket socket;
		private Scanner in;
		private PrintWriter out;
		
		/**
		 * Constructs a handler thread, squirreling away the socket. All the interesting
		 * work is done in the run method. Remember the constructor is called from the
		 * server's main method, so this has to be as short as possible.
		 */
		public boolean whisper(String a) {//user가 whisper mode를 사용하려고 하였는지 판별한다.
	           if(a.contains("<")&&a.contains("/>"))
	              return true;
	           else
	              return false;
	       }
		public Handler(Socket socket) {
			this.socket = socket;
		}

		/**
		 * Services this thread's client by repeatedly requesting a screen name until a
		 * unique one has been submitted, then acknowledges the name and registers the
		 * output stream for the client in a global set, then repeatedly gets inputs and
		 * broadcasts them.
		 */
		public void run() {
			try {
				in = new Scanner(socket.getInputStream());
				out = new PrintWriter(socket.getOutputStream(), true);

				// Keep requesting a name until we get a unique one.
				while (true) {//hash 함수에 없던 새로운 이름을 입력받는다.
					out.println("SUBMITNAME");
					name = in.nextLine();
					if (name == null) {
						return;
					}
					synchronized (names) {
						if (name.length() > 0 && !names.contains(name)) {
							names.add(name);
							break;
						}
					}
				}

				// Now that a successful name has been chosen, add the socket's print writer
				// to the set of all writers so this client can receive broadcast messages.
				// But BEFORE THAT, let everyone else know that the new person has joined!
				out.println("NAMEACCEPTED " + name);
				for(PrintWriter writer : writers) {
					writer.println("MESSAGE " + name + " has joined");
				}
				writers.add(out);

				// Accept messages from this client and broadcast them.
				while (true) {
					String input = in.nextLine();
					if (input.toLowerCase().startsWith("/quit")) {
						return;
					}
					if(whisper(input) == true) {//문자열이 <~/>형태로 되어있는지 확인한다.
						for (PrintWriter writer : writers) {
							writer.println("WHISPER " + name +": " + input);
						}
					}
					else {
						for (PrintWriter writer : writers) {
						writer.println("MESSAGE " + name + ": " + input);
						}//hash writer에 있는 모든 user에게 message를 보낸다.
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				//writers, names hash에서 저장된 값을 삭제하고 다른 user들에게 떠났다는 메세지를 보낸다
				if (out != null) {
					writers.remove(out);
				}
				if (name != null) {
					System.out.println(name + " is leaving");
					names.remove(name);
					for (PrintWriter writer : writers) {
						writer.println("MESSAGE " + name + " has left");
					}
				}
				try { socket.close(); } catch (IOException e) {}
			}//socket을 닫는다.
		}
	}
}
