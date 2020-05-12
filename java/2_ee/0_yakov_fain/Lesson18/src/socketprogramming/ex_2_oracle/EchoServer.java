package socketprogramming.ex_2_oracle;

import java.net.*;
import java.io.*;

public class EchoServer {
	
	private final static int PORTNUMBER = 3000;
	
	public static void main(String[] args) throws IOException {

		try (ServerSocket serverSocket = new ServerSocket(PORTNUMBER);
				Socket clientSocket = serverSocket.accept();
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				//out.println(inputLine);
				System.out.println("EchoServer: " + inputLine);
			}
		} catch (IOException e) {
			System.out.println(
					"Exception caught when trying to listen on port " + PORTNUMBER + " or listening for a connection");
			System.out.println(e.getMessage());
		}
	}
}
