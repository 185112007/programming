package socketprogramming.ex_2_oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3 {
	private final static String HOSTNAME = "localhost";
	private final static int PORTNUMBER = 3000;

	public static void main(String[] args) throws IOException {

		try (Socket echoSocket = new Socket(HOSTNAME, PORTNUMBER);
				PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
				BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
			// String userInput;
//			while ((userInput = stdIn.readLine()) != null) {
//				out.println(userInput);
//				System.out.println("EchoClient: " + in.readLine());
//			}

//			for (int i = 0; i < 10; i++) {
//				// Generete a random symbols
//				Random random = new Random();
//				byte[] b = new byte[20];
//				random.nextBytes(b);
//				out.println(b.toString());
//			}
			for (int i = 0; i < 20; i++) {
				out.println("client-3");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (UnknownHostException e) {
			System.err.println("Don't know about host " + HOSTNAME);
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection to " + HOSTNAME);
			System.exit(1);
		}
	}
}
