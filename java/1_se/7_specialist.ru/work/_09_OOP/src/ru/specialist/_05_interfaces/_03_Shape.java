package ru.specialist._05_interfaces;

import java.util.ArrayList;

public abstract class _03_Shape {
	public static final String DEFAULT_COLOR = "black";
	public String color;
	
	static ArrayList<_03_Shape> scene = new ArrayList<>();
	
	public _03_Shape() {
		this(DEFAULT_COLOR);
	}
	
	public _03_Shape(String color) {
		System.out.println("Shape contructor");
		this.color = color;
		scene.add(this);
	}
	
	public static void drawScene() {
		for (_03_Shape s : scene) {
			s.draw();
		}
	}
	
	public static void scaleScene(double factor) {
		for (_03_Shape s : scene) {
			if (s instanceof _02_Scaleabe) {
				_02_Scaleabe sc = (_02_Scaleabe)s;
				sc.scale(factor);
			}
		}
	}
	
	public abstract void draw();
}
