package ua.rba;

public class App1 {

	private static A1 a1;

	public static void main(String[] args) {
		// 1. load A1 to static ctx & create instance in heap
		a1 = new A1(); // call constructor of class A1
		System.out.println(a1 + "\n");
		a1 = new A1();
		System.out.println(a1 + "\n");
		A1 a11 = new A1();
		System.out.println(a11 + "\n");

		// 2.
		System.out.println(a1.getId() + "\n");
		
		// 3.
		A2 a2 = new A2();
		System.out.println(a2.toString() + "\n");
		
		// 4.
		A3 a3 = new A3("Hello world!");
		System.out.println(a3.getId() + ", " + a3.getName() + "\n");
		
		// 5.
		A3 a31 = new A3("a31");
		A3 a32 = new A3("a32");
		System.out.println("a31: " + a31);
		System.out.println("a32: " + a32);
		System.out.println(a31==a32);			// equals by hashcode
		System.out.println(a31.equals(a32) + "\n");	
		
		// 6.
		a31.counter = 100;
		System.out.println(a32.counter);
//		a31.counterStatic = 200;
//		System.out.println(a32.counterStatic);
		A3.counterStatic = 300;
		System.out.println(A2.counterStatic);
	}

}
