package ru.specialist.io;

import java.util.Date;

public class _01_OutputTest {

	public static void main(String[] args) {
		{//1. System.out.println(String)
			System.out.println("hello");
			System.out.println("world!");
			
			System.out.print("hello");
			System.out.println("world!");
		}
		
		{// 2. System.out.printf(String, args)
			String name = "Sergey";
			int age = 40;
			// Privet, Sergey - 40!
			System.out.printf("Privet, %s - %d!\n", name, age);
		}
		
		{// 3. String.format(String, args);
			String name = "Sergey";
			int age = 40;
			// Privet, Sergey - 40!
			String r = String.format("Privet, %s - %d!", name, age);
			System.out.println(r);
			
			System.out.printf("pi = %f\n", Math.PI);
			System.out.printf("pi = %.2f\n", Math.PI);
			System.out.printf("pi = %5.2f\n", Math.PI);
			
			System.out.printf("Privet, %10s - %d!\n", name, age);
		}
		
		{// 4. format string
			Date now = new Date();
			System.out.printf("%tY-%tm-%td\n", now, now, now);
			
			System.out.printf("%1$tY-%1$tm-%1$td\n", now);
			
			System.out.printf("%1$tY-%<tm-%<td\n", now);
			
			System.out.printf("%tF\n", now);
			
			System.out.printf("%tR\n", now);
		}
		
		{// 5. alternative of concatenation
			int i1 = 10;
			int i2 = 20;
			int i3 = 30;
			String r = String.format("%d %d %d", i1, i2, i3);
			System.out.println(r);
		}
	}

}
