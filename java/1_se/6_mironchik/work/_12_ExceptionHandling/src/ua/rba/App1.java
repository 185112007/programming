package ua.rba;

public class App1 {

	public static void main(String[] args) {
		App1.m1();
		App1.m2();
		try {
			App1.m3();
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
			System.exit(-100);
		}
	}

	// 1. java.lang.ArithmeticException: / by zero
	private static void m1() {
		int k = 10, q = 0;
		try {
			System.out.println(k / q);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	// 2. java.lang.ArrayIndexOutOfBoundsException
	private static void m2() {
		byte b[] = new byte[] { 1, 2, 3, 4, 5 };
		try {
			System.out.println(b[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	// 3. java.lang.ClassFormatError
	private static void m3() throws MyCustomException {

		try {
			Class.forName("ua.rba.util.Print");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ClassFormatError e) {
			System.out.println("Nevostanovimaya oshibka, e: " + e.getMessage());
			throw new MyCustomException("Vse - priehali...");
		}

	}
}
