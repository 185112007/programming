package ua.rba;


/*
 * Use only equals for compare Class types
 */
public class App1 {

	public static void main(String[] args) {
		App1.m1();
		App1.m2();
		App1.m3();
		App1.m4();
	}

	public static void m1() {
		System.out.println("1. int & Integer:");
		int i1 = 10;		// in stack
		Integer i2 = 10;	// in heap
		System.out.println("i1 == i2 ==> " + (i1 == i2));
		System.out.println("i2.equals(i1) ==> " + i2.equals(i1));	// autoboxing int to Integer
	}
	
	public static void m2() {
		System.out.println("\n2. Integer & Integer");
		Integer i1 = 127;						// in heap
		Integer i2 = 127;		// in heap
		System.out.println("i1 == i2 ==> " + (i1 == i2));
		System.out.println("i2.equals(i1) ==> " + i2.equals(i1));
	}
	
	public static void m3() {
		System.out.println("\n2. Integer & Integer");
		Integer i1 = 128;						// in heap
		Integer i2 = 128;						// in heap
		System.out.println("i1 == i2 ==> " + (i1 == i2));
		System.out.println("i2.equals(i1) ==> " + i2.equals(i1));
	}
	
	public static void m4() {
		System.out.println("\n2. Long & Long");
		Long i1 = 128L;						// in heap
		Long i2 = 128L;						// in heap
		System.out.println("i1 == i2 ==> " + (i1 == i2));
		System.out.println("i2.equals(i1) ==> " + i2.equals(i1));
	}
}
