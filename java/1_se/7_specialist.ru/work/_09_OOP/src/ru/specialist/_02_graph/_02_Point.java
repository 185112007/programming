package ru.specialist._02_graph;

public class _02_Point extends Shape {
	
	public int x;
	public int y;
	
	public _02_Point(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	
	public _02_Point(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
