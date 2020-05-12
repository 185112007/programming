package com.practicaljava.lesson5.tryit;

public class TestTax {

	public static void main(String[] args) {
		
		double grossIncome;
		String state;
		int dependents;
		
		if(args.length != 3) {
			System.out.println("Sample usage of the program: " +
			"java TestTax 50000 NY 2");
			System.exit(0);
		}
		
		grossIncome = Double.parseDouble(args[0]);
		state = args[1];
		dependents = Integer.parseInt(args[2]);
		
		Tax t = new Tax(grossIncome, state, dependents);
		
		double yourTax = t.calcTax();
		System.out.println("Your tax is " + Tax.convertTax2Euro(yourTax));
	}
}
