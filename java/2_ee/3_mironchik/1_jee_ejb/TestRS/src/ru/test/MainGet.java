package ru.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainGet {

	public static void main(String[] args) throws IOException, InterruptedException {
		for (int i = 0; i < 10; i++) {
			new Thread(
					() ->{
						HttpRequest request = HttpRequest.newBuilder()
								.uri(URI.create("http://localhost:8080/RestService/controller/hr/emps/2"))
								.header("Content-Type", "application/json").GET().build();
						HttpClient client = HttpClient.newHttpClient();
						HttpResponse<String> response = null;
						try {
							response = client.send(request, HttpResponse.BodyHandlers.ofString());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(response.statusCode());
						System.out.println(response.body());
					}
			).start();
			
		}
	}

}
