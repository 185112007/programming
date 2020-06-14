package ru.specialist.methods;

import static java.lang.System.out;

public class Program {

	public void sayHello() {
		out.println("Hello");
	}

	public static void sayHelloStatic() {
		out.println("Hello static method");
	}

	public static void sayUsernameAge(String userName, int age) {
		out.printf("Hello, %s - %d\n", userName, age);
	}

	public static double methodWithReturn(int a, int b) {
		double avg = (a + b) / 2.0;
		return avg;
	}

	public static void overloadedMethod() {
		out.printf("Hello!\n");
	}

	public static void overloadedMethod(String userName) {
		out.printf("Hello, %s!\n", userName);
	}

	public static void overloadedMethod(int age) {
		out.printf("Hello, %d!\n", age);
	}

	public static void overloadedMethod(String userName, int age) {
		out.printf("Hello, %s - %d!\n", userName, age);
	}

	public static double average1(int[] m) {
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return (double) sum / m.length;
	}

	public static double average2(int... m) {
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return (double) sum / m.length;
	}

	private static int gcd(int k1, int k2) {
		int k;

		while ((k = k1 % k2) != 0) {
			k1 = k2;
			k2 = k;
		}

		return k2;
	}
	
	static void test1(int a) {
		a++;
		out.printf("test 1 a = %d\n", a);
	}
	
	static void test2(int[] a) {
		a[0]++;
		out.printf("test 2 a = %d\n", a[0]);
	}
	
	static void test3(String a) {
		a += "!";		// creates new reference
		out.printf("test 3 a = %s\n", a);
	}
	
	static void test4(StringBuilder a) {
		a.append("!");		
		out.printf("test 4 a = %s\n", a);
	}

	public static void main(String[] args) {

		// 1. create object
		Program obj = new Program();

		// 2. call method
		obj.sayHello();

		// 3. call static method
		sayHelloStatic();
		// or
		Program.sayHelloStatic();

		// 4.
		sayUsernameAge("Gafur", 35);

		// 5.
		out.println(methodWithReturn(10, 11));

		// 6. overloading
		overloadedMethod();
		overloadedMethod(35);
		overloadedMethod("Gafur");
		overloadedMethod("Gafur", 35);

		// 7.
		out.println(average1(new int[] { 10, 11, 12, 13 }));
		out.println(average1(new int[] { 10, 11 }));

		out.println(average2(new int[] { 10, 11, 12, 13 }));
		out.println(average2(new int[] { 10, 11 }));
		// or basically
		out.println(average2(10, 11, 12, 13, 14));

		// 8. practice
		out.println(gcd(1071, 462));
		out.println(gcd(462, 1071));

		{// 9.
			// 1. value type(not reference type)
			int a = 10;
			int b = a;
			a++;

			out.printf("a = %d, b = %d\n", a, b);

			// 2. two references ar & br
			int[] ar = { 10 };
			int[] br = ar;
			ar[0]++;

			out.printf("ar[0] = %d, b[0] = %d\n", ar[0], br[0]);

			// 2. method clone
			int[] arr = { 10 };
			int[] brr = arr.clone();
			arr[0]++;

			out.printf("arr[0] = %d, brr[0] = %d\n", arr[0], brr[0]);
		}
		
		// 10.
		{
			int a = 10;
			test1(a);		// 11
			out.println(a);	// 10
			
			int[] a2 = {10};
			test2(a2);			// 11
			out.println(a2[0]);	// 11
			
			String a3 = "Gafur";
			test3(a3);			// Gafur!
			out.println(a3);		// Gafur
			
			StringBuilder a4 = new StringBuilder("Gafur");
			test4(a4);
			out.println(a4);
		}
	}

}
