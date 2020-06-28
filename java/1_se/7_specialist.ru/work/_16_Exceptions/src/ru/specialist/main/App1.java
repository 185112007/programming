package ru.specialist.main;

import ru.specialist.ex.MyException;

public class App1 {

	public static void main(String[] args) {
		{// 1
			System.out.println("----1:");
			test1("123", "3");
//			test1("123dfg", "3");
			test1("125", "4");
		}

		{// 2
			System.out.println("----2:");
			test2("123", "3");
			System.out.println("continue method main");

			test2("123ssdasd", "3");
			System.out.println("continue method main");

			test2("123", "0");
			System.out.println("continue method main");
		}

		{// 3
			System.out.println("----3:");

			try {
				test3("123", "0");
			} catch (ArithmeticException e) {
				System.out.println("/ by zero(main)");
			}
			System.out.println("continue method main");
		}

		{// 4
			System.out.println("----4:");

			try {
				test3("123", "0");
			} catch (ArithmeticException | NumberFormatException e) { // 1.variant
				System.out.println("/ by zero(main)");
			}

			try {
				test3("123", "0");
			} catch (Exception e) { // 2.variant (not recommended)
				System.out.println(e.getMessage());
			}

			try {
				test3("123", "0");
			} catch (ArithmeticException e) { // 3.variant(not recommended)
				System.out.println("/ by zero(main)");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("continue method main");
		}

		{// 5 throw new exception
			System.out.println("----5: throw exception");
			try {
				test5("123", "0");
			} catch (ArithmeticException e) {
				System.out.println("/by zero");
			}
			System.out.println("continue main method");
		}

		{// 6. throw new custom exception
			System.out.println("----6: throw myexception");
			try {
				test6("123", "0");
			} catch (ArithmeticException e) {
				System.out.println("/by zero");
			}
			System.out.println("continue main method");
		}
		
		{// 7. finally block
			System.out.println("----7: finally block");
			try {
				test6("123", "0");
			} catch (ArithmeticException e) {
				System.out.println("/by zero");
			} finally {
				System.out.println("finally block");
			}
			System.out.println("continue main method");
		}
	}

	// 1
	public static void test1(String a, String b) {
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);

		int n = n1 / n2;
		System.out.println(n);
	}

	// 2
	public static void test2(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);

			int n = n1 / n2;
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("not a number");
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		}
		System.out.println("continue method test2");
	}

	// 3
	public static void test3(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);

			int n = n1 / n2;
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("not a number");
		}
		System.out.println("continue method test2");
	}

	// 5 throw new Exception
	public static void test5(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);

			if (n1 < 0 || n1 > 100) {
				throw new IllegalArgumentException("n1 out of [0, 100]");
			}

			int n = n1 / n2;
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("not a number");
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("continue method test5");
	}

	// 6 throw new MyException
	public static void test6(String a, String b) {
		try {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);

			if (n1 < 0 || n1 > 100) {
				throw new MyException("n1 out of [0, 100]", n1);
			}

			int n = n1 / n2;
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("not a number");
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		} catch (MyException e) {
			System.out.printf("%s invalid data == %d\n", e.getMessage(), e.getInvalidData());
		}
		System.out.println("continue method test5");
	}
}
