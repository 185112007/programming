package ru.specialist.main;

import ru.specialist.enums._01_Colors;
import ru.specialist.enums._02_Colors;

public class App1 {

	public static void main(String[] args) {
		{// 1.
			System.out.println("----1:");
			_01_Colors c1 = _01_Colors.Red;
			System.out.println(c1.name());
			System.out.println(c1.ordinal());
			
			_01_Colors c2 = _01_Colors.valueOf("Green");
			System.out.println(c2.name());
			
			for (_01_Colors c : _01_Colors.values()) {
				System.out.println(c);
			}
		}
		
		{// 2.
			System.out.println("----2:");
			_02_Colors c1 = _02_Colors.Red;
			System.out.println(c1.name());
			System.out.println(c1.upperName());
			System.out.println(c1.ordinal());
			
			_02_Colors c2 = _02_Colors.valueOf("Green");
			System.out.println(c2.name());
			
			for (_01_Colors c : _01_Colors.values()) {
				System.out.println(c);
			}
		}
	}

}
