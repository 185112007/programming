package ru.specialist._02_graph;

public class _03_Point extends Shape {
	
	public int x;
	public int y;
	
	public _03_Point(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	
	public _03_Point(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.printf("Point (%d, %d). Color: %s\n", x, y, color);
	}
}
