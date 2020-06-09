package ru.specialist;

// 8. import
import java.util.Date;
import java.util.Calendar;

//9. static import - import static vars & static methods
import static java.lang.Math.PI;
import static java.lang.Math.cos;

import java.math.BigDecimal;
import java.math.BigInteger;

//10. java.lang.* package automatic imports
//import java.lang.*;

public class _01_Program {

	// 6. defaul value
	public static int x;

	// 7.3 global scope
	int y;

	// 11. constant
	public static final double PI2 = 2 * Math.PI;

	public static void main(String[] args) {
		// 1. declaration of vars
		{
			int counter;

			// 2. initialization of vars
			counter = 12;

			// 3. getting value of vars
			System.out.println(counter);

		}

		// 4. decl & init vars
		{
			String userName = "gafur";
		}

		// 5.
		{
			int a, b, c = 10;
		}

		// 6. defaul value
		{
			System.out.println(x); // 0
		}

		// 7. scope
		// 7.1 bock scope
		{
			// block scope
			int z = 19;
			System.out.println(z);
		}
		// System.out.println(z);
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
		double cosPI = cos(PI); // static import of static var & method
		System.out.println(cosPI);

		// 10. java.lang.* package automatic imports

		// 11. autoboxing
		int k1 = 4;
		Integer k2 = k1; // boxing
		int k3 = k2; // unboxing

		// 12. constant
		final double dConst = 13.0;
		// dConst = 12.0; // we cannot change final vars

		// 13. operations: + * / %

		// 14. casting
		{
			byte b1 = 100;
			int i1 = b1;
			byte b2 = (byte) i1; // casting
		}
		
		{
			int iy = Integer.MAX_VALUE;
			System.out.println(iy);
			long l1 = iy + 1; // long <--- int
			System.out.println(l1);
			long l2 = (long) iy + 1; // 1.variant
			System.out.println(l2);
			long l3 = iy + 1L;
			System.out.println(l3);
		}
		
		{
			double d1 = 2.5;
			double d2 = 2.0;
			double d3 = 2; // double <--- int
			double d4 = 2d;
			double d5 = 2D;
		}
		{
//			float f1 = 2.5;	// float <--- double
			float f2 = (float) 2.5;
			float f3 = 2.5f;
			float f4 = 2.5F;
		}

		{
			byte b1 = 0x1F; // x16
			byte b2 = 040; // x8
		}
		
		{
			int a = 5;
			double d1 = a / 2;	// 2.0
			System.out.println(d1);
			double d2 = a / 2.0;
			System.out.println(d2);
			double d3 = a / 2d;
			System.out.println(d3);
			double d4 = (double)a / 2;
			System.out.println(d4);
		}
		
		{
			BigDecimal bigDecimal;
			BigInteger bigInteger;
		}
		
		{// char
			char ch1 = 'A';
			char ch2 = '\u004D';
			System.out.println(ch2);
			int charCode = (int)ch2;
			System.out.println(charCode);
		}
		
		{// boolean
			boolean b1 = true;
			boolean b2 = false;
			
			boolean b3 = b1 && b2;	// and operator
			System.out.println(b3);
			boolean b4 = b1 || b1;	// or operator
			System.out.println(b4);
			boolean b5 = !b1;
			System.out.println(b5);
		}
		
		{
			int n = 10;
			
			boolean b = (n/2) == (n-5);	// 5==5 --> true
			System.out.println(b);
			
			b = (n>=0) && (n<=100);
			System.out.println(b);
		}
		
		{
			int i = 10;
			i = i * 2;  // =20
			i *= 2;		// =40; same as i = i * 2;
			
			// increment
			i = i + 1;	// =41
			i += 1;		// =42
			i++;		// =43
			++i;		// =44
			
			// decrement
			i = i - 1;	// =43
			i -= 1;		// =42
			i--;		// =41
			--i;		// =40
			
			int b = ++i;	// = 41; (1) i++, (2)b=i
			System.out.println(b);
			int c = i++;	// = 41; (1) b=i, (2)i++
			System.out.println(c);
		}
		
		{
			int a = 7;		// 0111	- mladsie bity
			int b = 5;		// 0101
			int c = a & b;	// 0101
			System.out.println(c);
			
			c = a | b;		// 0111
			System.out.println(c);
			
			c = ~a;			// 1000
			System.out.println(c);
			
			c = a << 2;	// 0111 << 2 = 011100
			System.out.println(c);
			
			c = a >> 1;// 0111 >> 1 = 0011
			System.out.println(c);
			
			a = -7;
			c = a >> 1;				// sdvig 31 bitov
			System.out.println(c);
			c = a >>> 1;			// sdvig 32 bitov
			System.out.println(c);
			
			a = 5;	// 0101
					// 3210 
			c = (a >> 1) & 1;	// get 1th bit of 0101
			System.out.println(c);
		}
	}

}
