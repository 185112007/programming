package ru.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.modeldb.postgres.Emp;

public class MainPost {

	public static void main(String[] args) throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/RestService/controller/hr/emp"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString("2")).build();
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
		
		ObjectMapper mapper = new ObjectMapper();
		
		Emp emp = mapper.readValue(response.body(), Emp.class);
		System.out.println(emp);
		emp.setSal(emp.getSal() + 1);
		System.out.println(emp);
		
	}

}
