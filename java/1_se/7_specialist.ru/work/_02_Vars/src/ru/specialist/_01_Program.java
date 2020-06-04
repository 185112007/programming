package ru.specialist;

// 8. import
import java.util.Date;
import java.util.Calendar;

//9. static import - import static vars & static methods
import static java.lang.Math.PI;
import static java.lang.Math.cos;

//10. java.lang.* package automatic imports
//import java.lang.*;

public class _01_Program {

	// 6. defaul value
	public static int x;
	
	// 7.3 global scope
	int y;
	
	// 11. constant
	public static final double PI2 = 2*Math.PI;
	
	public static void main(String[] args) {
		// 1. declaration of vars
		int counter;
		
		// 2. initialization of vars
		counter = 12;
		
		// 3. getting value of vars
		System.out.println(counter);
		
		// 4. decl & init vars
		String userName = "gafur";
		
		// 5. 
		int a, b, c = 10;
		
		// 6. defaul value
		System.out.println(x);	// 0
		
		// 7. scope
		// 7.1 bock scope
		{
			// block scope
			int z = 19;
			System.out.println(z);
		}
		//System.out.println(z);
		{
			String z = "abc";
			System.out.println(z);
		}
		
		// 7.2 local scope
		int localVar = 14;
		
		// 7.3 global scope
		
		// 8. import
		Date date;
		Calendar calendar;
		
		// 9. static import - import static vars & static methods
		double sinPI = Math.sin(Math.PI);
		System.out.println(sinPI);
		double cosPI = cos(PI);	// static import of static var & method
		System.out.println(cosPI);
		
		// 10. java.lang.* package automatic imports
		
		// 11. autoboxing
		int k1 = 4;
		Integer k2 = k1;	// boxing
		int k3 = k2;		// unboxing
		
		// 11. constant
		final double dConst = 13.0;
		// dConst = 12.0;	// we cannot change final vars
		
	}

}
