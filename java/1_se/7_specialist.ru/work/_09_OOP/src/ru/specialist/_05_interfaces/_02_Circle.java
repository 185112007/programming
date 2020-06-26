package ru.specialist._05_interfaces;

public class _02_Circle extends _02_Shape implements _02_Scaleabe{
	
	public int x;
	public int y;
	public int r;
	
	public _02_Circle(int x, int y, int r) {
		this(x, y, r, DEFAULT_COLOR);
	}
	
	public _02_Circle(int x, int y, int r, String color) {
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
