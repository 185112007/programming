package socketprogramming.ex_1;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class MyClient {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("localhost", 3333);
		OutputStream dout = s.getOutputStream();

		Random random = new Random();
		

		// Generete a random symbols
		for (int i = 0; i < 10; i++) {
			byte[] b = new byte[20];
			random.nextBytes(b);
			for (byte bb : b) {
				System.out.print(bb + ",");
			}
			System.out.println();
			dout.write(b);
			dout.flush();
			
			Thread.sleep(1000);
		}

		dout.close();
		s.close();
	}
}
