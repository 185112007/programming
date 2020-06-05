package ru.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Timestamp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.modeldb.postgres.Emp;

public class MainUpdateEmp {

	public static void main(String[] args) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/RestService/controller/hr/emp"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString("1")).build();
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
//		System.out.println(response.body());
		
		// json to object
		String jsonStr = response.body();
		
		ObjectMapper mapper = new ObjectMapper();
		Emp emp = null;
		try {
			emp = mapper.readValue(jsonStr, Emp.class);
		} catch (JsonMappingException e) {
			System.out.println("jsonmappingexception");
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			System.out.println("jsonprocessingexception");
			e.printStackTrace();
		}
		
		System.out.println(emp);
	    
		// update
		emp.setSal(emp.getSal() + 100);
		
		emp.setHiredate(new Timestamp(System.currentTimeMillis()));
		System.out.println(emp);
		
		String json = "";
		try {
			// object to json
			json = mapper.writeValueAsString(emp);
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
		System.out.println(json);
		request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/RestService/controller/hr/updateemp"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(json)).build();
		
		response = null;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(response.statusCode());
	}

}
