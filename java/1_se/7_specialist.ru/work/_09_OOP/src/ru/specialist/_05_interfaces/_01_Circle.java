package ru.specialist._05_interfaces;

public class _01_Circle extends _01_Shape {
	
	public int x;
	public int y;
	public int r;
	
	public _01_Circle(int x, int y, int r) {
		this(x, y, r, DEFAULT_COLOR);
	}
	
	public _01_Circle(int x, int y, int r, String color) {
		super(color);
		System.out.println("Circle contructor");
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void scale(double factor) {
		r = (int)(factor * r);
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		System.out.printf("Circle (%d, %d). R: %d. Color: %s\n", x, y, r, color);
	}
	
	@Override
	public String toString() {
		return String.format("Circle (%d, %d). R: %d. Color: %s", x, y, r, color);
	}
	
}
