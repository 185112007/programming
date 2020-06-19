package ru.specialist;

import ru.specialist._02_graph.*;

public class App2 {

	public static void main(String[] args) {
		{// 1
			System.out.println("----1:-----");
			_01_Point p1 = new _01_Point();
			p1.draw();
		}
		
		{// 2
			System.out.println("----2:----");
			_02_Point p1 = new _02_Point(10, 20, "red");
			p1.draw();
		}
		
		{// 3
			System.out.println("----3:----");
			_03_Point p1 = new _03_Point(10, 20, "red");
			p1.draw();
		}
		
		{// 4
			System.out.println("----4:----");
			_04_Point p1 = new _04_Point(10, 20, "red");
			p1.draw();
		}
		
		{// 5
			System.out.println("----5:----");
			_05_Point p1 = new _05_Point(10, 20, "red");
			System.out.println(p1.toString());
			// or
			System.out.println(p1);		// call toString neyavno
		}
		
		{// 6
			System.out.println("----6:----");
			_06_Point p1 = new _06_Point(10, 20, "green");
			_06_Point p2 = p1;
			p1.color = "red";		
			p2.draw();		// red
		}
		
		{// 7
			System.out.println("----7:----");
			_07_Point p1 = new _07_Point(10, 20, "green");
			_07_Point p2 = p1.clone();
			p1.color = "red";		
			p2.draw();
		}
		
		{// 8
			System.out.println("----8:----");
			_08_Point p1 = new _08_Point(10, 20, "green");
			_08_Point p2 = p1.clone();
			p1.color = "red";		

			_08_Circle c1 = new _08_Circle(10, 20, 30, "pink");
			c1.scale(1.2);
			
			_08_Shape.drawScene();
		}
	}

}
