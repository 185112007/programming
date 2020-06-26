package ru.specialist._04_abstraction;

import java.util.ArrayList;

public abstract class _01_Shape {
	public static final String DEFAULT_COLOR = "black";
	public String color;
	
	static ArrayList<_01_Shape> scene = new ArrayList<>();
	
	public _01_Shape() {
		this(DEFAULT_COLOR);
	}
	
	public _01_Shape(String color) {
		System.out.println("Shape contructor");
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene() {
		for (_01_Shape s : scene) {
			s.draw();
		}
	}
	
	public void draw() {
		System.out.printf("Shape. Color: %s\n", this.color);
	}
}
