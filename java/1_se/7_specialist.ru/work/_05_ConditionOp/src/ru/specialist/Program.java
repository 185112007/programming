package ru.specialist;

import static java.lang.System.out;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		{// 1. if
			System.out.println("IF:");
			int n = 10;
			if (n > 0)
				out.println("n bolshe nulya");

			n = -10;
			if (n < 0) {
				out.println("n = " + n);
				out.println("n mense nulya");
			}
		}

		{// 2. ifelse
			System.out.println("\nIF-ELSE:");
			int n = 10;

			if (n < 0) {
				out.println("n = " + n);
				out.println("n mense nulya");
			} else {
				out.println("n = " + n);
				out.println("n bolshe nulya");
			}
		}

		{// 3. nested if-else
			System.out.println("\nNESTED IF-ELSE:");
			int n = 10;

			if (n < 0) {
				out.println("n = " + n);
				out.println("n mense nulya");
			} else {
				if (n > 5) {
					out.println("n = " + n);
					out.println("n bolshe 5");
				} else {
					out.println("n = " + n);
					out.println("n bolshe 5");
				}
			}
		}

		{// 4. ternary operation
			System.out.println("\nTERNARY OP:");
			int a = 0;
			String s;
			// if else
			if (a == 0) {
				s = "nol";
			} else {
				s = "ne nol";
			}

			// ternary alternative
			s = (a == 0) ? "nol" : "ne nol";

			// ternary usage
			String r = "Sergey";
			out.println(r.toUpperCase());
			r = null;
			out.println(r == null ? "<empty>" : r.toUpperCase());
		}

		{// 5. switch operator
			out.println("\nSWITCH:");

			int b = 2;
//			b = 100;
			switch (b) {
			case 1:
				out.println("odin");
				break;
			case 2:
				out.println("dva");
				break;
			case 3:
				out.println("tri");
				break;
			default:
				out.println("default");
			}
		}

		{// 6. compare strings(do not use '==' for strings)
			System.out.println("\n6. String compare");
			String s1 = "hello";
			String s2 = "hello";

			if (s1 == s2) { // true
				out.println("TRUE");
			} else {
				out.println("FALSE");
			}

			Scanner sc = new Scanner(System.in);
			if (sc.hasNextLine()) {
				s2 = sc.nextLine();
			}
			out.println(s2);
			if (s1 == s2) { // false
				out.println("TRUE");
			} else {
				out.println("FALSE");
			}

			sc.close();
		}

		{// 7. compare strings
			System.out.println("\n7. String compare");
			String s1 = "hello";
			String s2 = "hello";

			if (s1.equals(s2)) { // true
				out.println("TRUE");
			} else {
				out.println("FALSE");
			}

			out.print("s2: ");
			Scanner sc = new Scanner(System.in);

			s2 = sc.nextLine();

			out.println(s2);
			if (s1.equals(s2)) { // true
				out.println("TRUE");
			} else {
				out.println("FALSE");
			}

			sc.close();
		}
	}

}
