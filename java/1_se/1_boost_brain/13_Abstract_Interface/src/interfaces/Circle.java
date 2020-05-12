package interfaces;

public class Circle implements Shape {
	
	double radius;
	String color;
	
	public Circle(double rad, String col) {
		radius = rad;
		color = col; 
	}
	
	@Override
	public String getName() {
		return "circle";
	}

	@Override
	public double getSquare() {
		return 3.1415926 * radius * radius;
	}

	@Override
	public String getColor() {
		return color;
	}

}
