package ru.specialist._04_abstraction;

import java.util.ArrayList;

public abstract class _02_Shape {
	public static final String DEFAULT_COLOR = "black";
	public String color;
	
	static ArrayList<_02_Shape> scene = new ArrayList<>();
	
	public _02_Shape() {
		this(DEFAULT_COLOR);
	}
	
	public _02_Shape(String color) {
		System.out.println("Shape contructor");
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene() {
		for (_02_Shape s : scene) {
			s.draw();
		}
	}
	
	public abstract void draw();
}
