package ru.specialist;

import ru.specialist._05_interfaces._02_Circle;
import ru.specialist._05_interfaces._02_Scaleabe;
import ru.specialist._05_interfaces._03_Circle;
import ru.specialist._05_interfaces._03_Moveable;
import ru.specialist._05_interfaces._03_Scaleabe;

public class App5 {

	public static void main(String[] args) {
		{// 1.
			
		}
		
		{// 2.
			_02_Circle c1 = new _02_Circle(10, 20, 30, "green");
			_02_Scaleabe sc1 = c1;
			
			sc1.scale(1.5);
		}
		
		{// 3.
			_03_Circle c1 = new _03_Circle(10, 20, 30, "green");
			_03_Scaleabe sc1 = c1;
			
			sc1.scale(1.5);
			
			System.out.println(_03_Scaleabe.DEFAULT_FACTOR);
			System.out.println(_03_Moveable.DEFAULT_FACTOR);
			
		}
	}

}
