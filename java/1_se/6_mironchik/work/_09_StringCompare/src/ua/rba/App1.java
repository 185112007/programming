package ua.rba;

public class App1 {

	public static void main(String[] args) {
		App1 app1 = new App1();

		app1.compare1();
		app1.compare2();
		app1.compare3();
		app1.compare4();
		app1.compare5();
		app1.compare6();
		app1.compare7();
		app1.compare8();
		app1.compare9();
	}

	// 1. compare string objects
	public void compare1() {
		// 1. compare 2 string objects
		System.out.println("1. new String(\"Hello\") & new String(\\\"Hello\\\"):");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("s1 == s2 ==> " + (s1 == s2)); // false
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 2.
	public void compare2() {
		System.out.println("2. String.valueOf(\"Hello\") & String.valueOf(\\\"Hello\\\"):");
		String s1 = String.valueOf("Hello"); //
		String s2 = String.valueOf("Hello");
		System.out.println("s1 == s2 ==> " + (s1 == s2)); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 3.
	public void compare3() {
		System.out.println("3. new String(\"Hello\") & String.valueOf(\"Hello\")");
		String s1 = new String("Hello");
		String s2 = String.valueOf("Hello");
		System.out.println("s1 == s2 ==> " + (s1 == s2)); // false
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 4.
	public void compare4() {
		System.out.println("4. new String(\"Hello\") & new String(\\\"Hello\\\"):");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("s1.equals(s2) ==> " + (s1.equals(s2))); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 5.
	public void compare5() {
		System.out.println("5. String.valueOf(\"Hello\") & String.valueOf(\\\"Hello\\\"):");
		String s1 = String.valueOf("Hello");
		String s2 = String.valueOf("Hello");
		System.out.println("s1.equals(s2) ==> " + (s1.equals(s2))); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 6.
	public void compare6() {
		System.out.println("6. new String(\"Hello\") & String.valueOf(\"Hello\")");
		String s1 = new String("Hello");
		String s2 = String.valueOf("Hello");
		System.out.println("s1.equals(s2) ==> " + (s1.equals(s2))); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 7.
	public void compare7() {
		System.out.println("7. \"Hello\" & \"Hello\"");
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("(s1 == s2) ==> " + (s1 == s2)); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 8.
	public void compare8() {
		System.out.println("8. new String(\"Hello\") & \"Hello\"");
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.println("(s1 == s2) ==> " + (s1 == s2)); // false
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}

	// 9.
	public void compare9() {
		System.out.println("9. String.valueOf(\"Hello\") & \"Hello\"");
		String s1 = String.valueOf("Hello");
		String s2 = "Hello";
		System.out.println("(s1 == s2) ==> " + (s1 == s2)); // true
		System.out.println("s1: " + s1 + ", s2: " + s2 + "\n");
	}
}
