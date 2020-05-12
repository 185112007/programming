package socketprogramming.multithreaded.client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import socketprogramming.multithreaded.Employee;

public class Client1 {
	public static void main(String[] args) {

		String hostname = "localhost";
		int port = 3000;
		boolean condition = true;
		while (condition) {
			try (Socket server = waitSocketConnection(hostname, port);
					ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());) {

				Employee emp = null;
				do {
					//text = "client-1";

					emp = new Employee("A", "B");
					out.writeObject(emp);

					//writer.println(text);
					Thread.sleep(2000);
				} while (emp != null);

				server.close();

			} catch (Exception ex) {
				System.out.println("Exception: " + ex.getMessage());
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			} 
		}
	}
	
	private static Socket waitSocketConnection(String hostname, int port) {
		Socket server;
		System.out.println("Wait server connection...");
		while (true) {
			try {
				server = new Socket(hostname, port);
				if (server != null) {
					System.out.println("Connected!!!");
					break;
				}
			} catch (IOException e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					System.out.println("Interrupted in class: " + e1.getClass());
				}
			}
		}
		return server;
	}
}
