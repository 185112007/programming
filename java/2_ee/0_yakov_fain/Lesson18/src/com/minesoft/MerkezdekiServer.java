package com.minesoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MerkezdekiServer {
	public static void main(java.lang.String[] args) {
		ServerSocket serverSocket = null;
		Socket client = null;

		BufferedReader inbound = null;

		try {
			// Create a server socket
			serverSocket = new ServerSocket(3000);

			System.out.println("Waiting for a client");
			while (true) {
				// Wait for a request
				client = serverSocket.accept();

				// Get the streams
				inbound = new BufferedReader(new InputStreamReader(client.getInputStream()));
				System.out.println("Request: ");
				
				byte[] symbols = inbound.readLine().getBytes();

				for (byte b : symbols) {
					System.out.print(b + ",");
				}
				System.out.println();
			}
		} catch (IOException ioe) {
			System.out.println("Error in Server: " + ioe);
		} finally {
			try {
				inbound.close();
			} catch (Exception e) {
				System.out.println("MerkezdekiServer: can't close streams" + e.getMessage());
			}
		}
	}
}
