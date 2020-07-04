package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class App1 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket ss = new ServerSocket(1111);
		
		while (true) {
			Socket cs = ss.accept();	// prinyat soedinenie
			
			System.out.printf("Accept connection from %s\n", cs.getInetAddress().toString());
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(cs.getInputStream(), Charset.forName("UTF-8")));
			
			String s = reader.readLine();
			
			System.out.println(s);
			Thread.sleep(2000);
			
			OutputStreamWriter writer = new OutputStreamWriter(
					cs.getOutputStream(), StandardCharsets.UTF_8);
			writer.write(s.toUpperCase() + "\n");
			writer.flush();
			
			if (s.equals("stop")) {
				ss.close();
				writer.close();
				cs.close();
				break;
			}
		}
	}

}
