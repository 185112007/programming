package ru.specialist._02_graph;

public class Shape {
	public static final String DEFAULT_COLOR = "black";
	public String color;
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	
	public Shape(String color) {
		System.out.println("Shape contructor");
		this.color = color;
	}
	
	public void draw() {
		System.out.printf("Shape. Color: %s\n", this.color);
	}
}
