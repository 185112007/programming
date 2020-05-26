package ru.rest;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(value = "controller")
public class _01_Application extends Application {
	
	@PostConstruct
	public void init() {
		System.out.println("-------Application Rest");
	}
}
