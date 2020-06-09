package ru.specialist.io;

import java.util.Locale;
import java.util.Scanner;

public class _03_Temperature {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		double tf = tc * 9/5 + 32;
		
		
		System.out.printf(/*Locale.US,*/"T (F): %.2f\n", tf);
		
		sc.close();
	}

}
