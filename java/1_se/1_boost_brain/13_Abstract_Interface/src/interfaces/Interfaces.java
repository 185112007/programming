package interfaces;

import java.util.ArrayList;

public class Interfaces {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		Shape circle = new Circle(12.0, "red");
		Shape rectangle = new Rectangle(23.0, 2, "blue");
		shapes.add(circle);
		shapes.add(rectangle);
		printShapes(shapes);
	}
	
	public static void printShapes(ArrayList<Shape> shapes) {
		for(Shape shape : shapes) {
			System.out.println("Name: " + shape.getName());
			System.out.println("Square: " + shape.getSquare());
			System.out.println("Color: " + shape.getColor());
		}
	}
}
