package abstracts;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double rad) {
		super("blue");
		radius = rad;
	}
	
	public String getName() {
		return "circle";
	}

	public double getSquare() {
		return 3.1415926 * radius * radius;
	}

}
