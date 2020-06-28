package ru.specialist.main;

import java.util.List;
import java.util.Scanner;

import ru.specialist.interfaces.ITest;

public class App1 {

	public static void main(String[] args) {
		{// 1. JShell
			System.out.println("----1. JSell----");
		}
		
		{// 2. call default method
			System.out.println("\n----2. call default method:----");
			new ITest() {}.test();
		}
		
		{// 3. immutable collections
			System.out.println("\n----3. immutable collections:----");
			List<String> list = List.of("one", "two", "three");
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		{// 4. modules
			System.out.println("\n----4. modules:----");
			
		}
		
		{// 5.try with resources
			System.out.println("----5.try with resources:----");
			Scanner sc = new Scanner(System.in);
			try(sc) {
				
			} 
		}
	}

}
