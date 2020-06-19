package ru.specialist._02_graph;

public final /* final - nelzya nasledovatsa etim klassom */ class _09_Point extends _08_Shape {
	
	public int x;
	public int y;
	
	public _09_Point(int x, int y) {
		this(x, y, DEFAULT_COLOR);
	}
	
	public _09_Point(int x, int y, String color) {
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
	public final /*final - nelzya pereopredelit method */ void draw() {
		System.out.printf("Point (%d, %d). Color: %s\n", x, y, color);
	}
	
	@Override
	public String toString() {
		return String.format("Point (%d, %d). Color: %s", x, y, color);
	}
	
	@Override
	public _09_Point clone() {
		return new _09_Point(this.x, this.y, this.color);
	}
}
