package ru.specialist.io;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class _02_InputTest {

	public static void main(String[] args) throws IOException{
		
		// 1. BufferedReader, reads only strings
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		{
			System.out.print("Vashe imya: ");
			String name = br.readLine();
			System.out.print("Vash vozrast: ");
			int age = Integer.parseInt(br.readLine());
			System.out.print("Enter double: ");
			double d = Double.parseDouble(br.readLine());
			
			System.out.println("Imya: " + name);
			System.out.println("Vozrast: " + age);
			System.out.println("Double: " + d);
		}
		
		// 2. Scanner
		System.out.println();
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Vashe imya: ");
			String name = sc.nextLine();
			
			System.out.print("Vashe familiya: ");
			String lname = sc.next();
			
			System.out.print("Vash vozrast: ");
			int age = sc.nextInt();
			
			System.out.print("Enter double: ");
			double d = sc.nextDouble();
			
			System.out.println("Imya: " + name);
			System.out.println("Familya: " + lname);
			System.out.println("Vozrast: " + age);
			System.out.println("Double: " + d);
		}
		sc.close();
	}

}
