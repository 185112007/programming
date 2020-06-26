package ru.specialist._03_encapsulation;

public class Circle extends Shape {
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r, String color) {
		super(color);
		setX(x);
		setY(y);
		setR(r);
	}
	
	@Override
	public void draw() {
		System.out.println("----draw: Circle----");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		if(r > 0)
			this.r = r;
		else
			throw new RuntimeException("radius <= 0");
	}
}
