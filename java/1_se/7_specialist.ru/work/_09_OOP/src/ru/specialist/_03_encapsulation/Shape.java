package ru.specialist._03_encapsulation;

public class Shape {
	public String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public void draw() {
		System.out.println("----draw: Shape----");
	}
}
