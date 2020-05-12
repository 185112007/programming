package interfaces;

public class Rectangle implements Shape {

	double height;
	double width;
	String color;
	
	public Rectangle(double h, double w, String col) {
		height = h;
		width = w;
		color = col;
	}
	
	@Override
	public String getName() {
		return "rectangle";
	}

	@Override
	public double getSquare() {
		return height * width;
	}

	@Override
	public String getColor() {
		return color;
	}

}
