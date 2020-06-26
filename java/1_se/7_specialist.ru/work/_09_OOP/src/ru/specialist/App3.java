package ru.specialist;

import ru.specialist._02_graph.Shape;
import ru.specialist._02_graph._07_Point;
import ru.specialist._02_graph._08_Circle;
import ru.specialist._02_graph._08_Point;
import ru.specialist._02_graph._08_Shape;
import ru.specialist._03_encapsulation.Circle;
import ru.specialist._03_encapsulation.Singleton;

public class App3 {

	public static void main(String[] args) {
		{// 1. casting
			System.out.println("----1. casting:-----");

			_07_Point p1 = new _07_Point(10, 20, "green");

			Shape s1 = p1; // mojno ssylatsa ssylkoy roditelkogo klassa
//			s1.moveBy(1, 1);	// we can not access to this method

			_07_Point p2 = (_07_Point) s1; // casting
			p2.moveBy(1, 1);
			System.out.println(p2);
		}

		{// 2. instanceof
			System.out.println("----2. instanceof:----");

			_07_Point p1 = new _07_Point(10, 20, "green");

			Shape s1 = p1;

			if (s1 instanceof _07_Point) {
				_07_Point p2 = (_07_Point) s1; // casting
				p2.moveBy(1, 1);
				System.out.println(p2);
			}
		}
		
		{// 3. polimorphizm
			System.out.println("----3. polimorphizm----");
			
			_08_Point p1 = new _08_Point(10, 20, "green");

			_08_Shape s1 = p1;
			
			p1.draw();	// call method of Point
			s1.draw();	// call method of Point
			
			_08_Circle c1 = new _08_Circle(2, 3, 4, "gray");
			
			s1 = c1;
			
			s1.draw();
		}
		
		{// 4. encapsulation
			System.out.println("----4. encapsulation----");
			Circle c1 = new Circle(10, 20, 50, "green");
			
			c1.setR(50);
			System.out.println(c1.getR());
			
			c1.setR(100);
			
		}
		
		{// 5. singleton
			System.out.println("----5. singleton----");
			Singleton s1 = Singleton.getInstance();
			Singleton s2 = Singleton.getInstance();
			System.out.println(s1 == s2);
		}
	}

}
