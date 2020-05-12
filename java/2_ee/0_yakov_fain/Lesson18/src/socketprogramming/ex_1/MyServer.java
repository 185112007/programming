package socketprogramming.ex_1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(3333);
		System.out.println("Waiting for a client");
		Socket s = ss.accept();
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		BufferedReader inbound = new BufferedReader(new InputStreamReader(din));

		String str = "";
		while (!str.equals("stop")) {

			try {
				byte[] symbols = inbound.readLine().getBytes();

				for (byte b : symbols) {
					System.out.print(b + ",");
				}
				System.out.println();
			} catch (Exception e) {
				str = "stop";
				System.out.println("Exception!!!");
			}

		}
		din.close();
		s.close();
		ss.close();
	}
}
