package abstracts;

public class Rectangle extends Shape {

	double height;
	double width;
	
	public Rectangle(double h, double w) {
		super("red");
		height = h;
		width = w;
	}
	
	@Override
	public String getName() {
		return "rectangle";
	}

	@Override
	public double getSquare() {
		return height * width;
	}
}
