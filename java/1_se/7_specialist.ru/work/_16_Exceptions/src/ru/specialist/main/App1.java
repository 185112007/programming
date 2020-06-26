package ru.specialist.main;

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
			} catch (ArithmeticException | NumberFormatException e) {	// 1.variant
				System.out.println("/ by zero(main)");
			}
			
			try {
				test3("123", "0");
			} catch (Exception e) {	// 2.variant (not recommended)
				System.out.println(e.getMessage());
			}
			
			try {
				test3("123", "0");
			} catch (ArithmeticException e) {	// 3.variant(not recommended)
				System.out.println("/ by zero(main)");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("continue method main");
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
}
