package ru.specialist._03_encapsulation;

/*
 * Class Visibility:
	Modifier	Access_Level	Visibility
	public		public			world
				package			this package only
	
 */

public class Point extends Shape {
	
	/*
	 * Properties & Methods & Constructors Visibility:
		Modifier	Access_Level	Visibility
		public		public			world
		private		private			this class only
					package			this package only
		protected	protected		this class & this package & subclass
	
	 */
	public int x;
	public int y;
	
	public Point(int x, int y, String color) {
		super(color);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.println("----draw: Point----");
	}
}
