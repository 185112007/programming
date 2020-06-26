package ru.specialist._05_interfaces;

public class _02_Point extends _02_Shape {
	
	public int x;
	public int y;
	
	public _02_Point(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	
	public _02_Point(int x, int y, String color) {
		super(color);
		System.out.println("Point contructor");
		this.x = x;
		this.y = y;
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		System.out.printf("draw(): Point (%d, %d). Color: %s\n", x, y, color);
	}
	
	@Override
	public String toString() {
		return String.format("Point (%d, %d). Color: %s", x, y, color);
	}
	
	@Override
	public _02_Point clone() {
		return new _02_Point(this.x, this.y, this.color);
	}
}
