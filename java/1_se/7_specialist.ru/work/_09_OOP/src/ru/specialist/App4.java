package ru.specialist;

import ru.specialist._04_abstraction._01_Point;
import ru.specialist._04_abstraction._01_Shape;
import ru.specialist._04_abstraction._02_Point;
import ru.specialist._04_abstraction._02_Shape;

public class App4 {

	public static void main(String[] args) {
		{// 1. abstract class
			System.out.println("1. abstract class:");
			_01_Shape s1;

			// we cannot create instance of abstract classes
//			s1 = new _01_Shape();

			_01_Point p1 = new _01_Point(10, 20, "red");
			s1 = p1; // we can create reference to concrete objects
			s1.draw();
		}

		{// 2. abstract methods
			System.out.println("2. abstract methods");
			_02_Shape s1;

			_02_Point p1 = new _02_Point(10, 20, "red");
			s1 = p1; // we can create reference to concrete objects
			s1.draw();
		}
		
	}

}
