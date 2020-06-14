package ru.specialist.loop;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		// 1. for loop, esli my znaem N
		out.println("----1. for loop:----");
		for (int i = 0; i < 10; i++) {
			out.println(i);
		}

		// 2. continue
		out.println("----2. continue:----");
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				out.println("if i = 3 continue");
				continue;
			}
			out.println(i);
		}

		// 3. break
		out.println("----3. break:----");
		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				out.println("if i = 7 break");
				break;
			}
			out.println(i);
		}

		// 4. nested loops
		out.println("----4. nested loops:----");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				out.printf("%-4d", i * j);
			}
			out.println();
		}

		// 5. break with label
		out.println("----5. break with label:----");
		label: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5) {
					break label;
				}
				out.printf("%-4d", i * j);
			}
			out.println();
		}
		
		// 6. while loop
		{
			out.println("----6. while loop:----");
			int a = 2;
			while(a < 1000) {
				out.println(a);
				a *= 2;
			}
		}
		
		// 7. do-while loop
		{
			out.println("----6. do-while loop:----");
			int a = 2000;
			do {
				out.println(a);
				a *= 2;
			}while(a < 1000);
		}

	}

}
