package abstracts;

public abstract class Shape {
	
	private String color;
	
	public Shape(String col) {
		color = col;
	}
	
	public abstract String getName();
	public abstract double getSquare();
	
	public String getColor() {
		return color;
	}
}
