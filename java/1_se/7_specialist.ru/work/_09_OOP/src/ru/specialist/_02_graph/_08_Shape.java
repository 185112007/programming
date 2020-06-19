package ru.specialist._02_graph;

import java.util.ArrayList;

public class _08_Shape {
	public static final String DEFAULT_COLOR = "black";
	public String color;
	
	static ArrayList<_08_Shape> scene = new ArrayList<>();
	
	public _08_Shape() {
		this(DEFAULT_COLOR);
	}
	
	public _08_Shape(String color) {
		System.out.println("Shape contructor");
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene() {
		for (_08_Shape s : scene) {
			s.draw();
		}
	}
	
	public void draw() {
		System.out.printf("Shape. Color: %s\n", this.color);
	}
}
