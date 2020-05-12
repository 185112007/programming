package com.minesoft;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class MadendekiClient {
	public static void main(java.lang.String[] args) {

		OutputStream outbound = null;
		Socket clientSocket = null;

		try {
			// Open a client socket connection
			clientSocket = new Socket("localhost", 3000);
			System.out.println("Client: " + clientSocket);

			for (int i = 0; i < 10; i++) {
				// Get the output stream
				outbound = clientSocket.getOutputStream();
				// Generete a random symbols
				Random random = new Random();
				byte[] b = new byte[20];
				random.nextBytes(b);
				for (byte bb : b) {
					System.out.print(bb + ",");
				}
				System.out.println();
				// Send symbols to the server
				outbound.write(b);
				outbound.write("\n".getBytes()); // * is end of one stream
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
			}

		} catch (UnknownHostException uhe) {
			System.out.println("UnknownHostException: " + uhe);
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe);
		} finally {
			// Close the streams
			try {
				outbound.close();
				clientSocket.close();
			} catch (IOException e) {
				System.out.println("Can not close streams..." + e.getMessage());
			}
		}
	}
}
