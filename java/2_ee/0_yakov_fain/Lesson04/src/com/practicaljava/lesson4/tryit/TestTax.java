package com.practicaljava.lesson4.tryit;

public class TestTax {

	public static void main(String[] args) {
		double grossIncome;
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NY";
		
		Tax t = new Tax(grossIncome, state, dependents);
		
		double yourTax = t.calcTax();
		System.out.println("Your tax is " + Tax.convertTax2Euro(yourTax));
		
		Tax t2 = new Tax(65000, "TX", 4);
		double hisTax = t2.calcTax();
		System.out.println("His tax is " + Tax.convertTax2Euro(hisTax));
	}
}
