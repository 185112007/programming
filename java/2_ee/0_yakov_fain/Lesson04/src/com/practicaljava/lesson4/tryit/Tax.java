package com.practicaljava.lesson4.tryit;

public class Tax {
	
	double grossIncome;
	String state;
	int dependents;
	static int customerCount;
	
	Tax(double grossIncome, String state, int dependents) {
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
		customerCount++;
		System.out.println("Preparing the tax data for customer #" + customerCount);
	}
	
	double calcTax() {
	    return (grossIncome * 0.33 - dependents * 100);
	}
	
	static String convertTax2Euro(double tax) {
	    return "$" + tax + " (" + tax * 0.75 + " euros)";
	}
}
