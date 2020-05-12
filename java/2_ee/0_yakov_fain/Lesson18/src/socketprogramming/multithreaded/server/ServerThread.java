package socketprogramming.multithreaded.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import socketprogramming.multithreaded.Employee;


public class ServerThread extends Thread {
	private Socket client;

	public ServerThread(Socket socket) {
		this.client = socket;
	}

	public void run() {
		try {
			ObjectInputStream in = new ObjectInputStream(client.getInputStream()); // get the input stream of client.

			Employee emp = null;
			do {
				emp = (Employee) in.readObject(); // cast a Student class from reading the object
												  // that was sent to the server by the client.
				System.out.println("Name: " + emp.getFname() + ", Last Name: " + emp.getLname());
			} while (emp!=null);

			client.close();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Server exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
