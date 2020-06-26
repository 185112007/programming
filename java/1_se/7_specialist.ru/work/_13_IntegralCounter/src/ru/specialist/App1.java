package ru.specialist;

import java.util.function.DoubleFunction;

public class App1 {

	public static final int STEPS = 10_000_000;
	
	public static double integralOfSin(double a, double b) {
		double h = (b-a)/STEPS;
		double sum = 0.0;
		
		for (int i = 0; i < STEPS; i++) {
			double x = a + i*h + h/2;
			double y = Math.sin(x);
			sum += y*h; 
		}
		
		return sum;
	}
	
	public static double integral(MathFunc f, double a, double b) {
		double h = (b-a)/STEPS;
		double sum = 0.0;
		
		for (int i = 0; i < STEPS; i++) {
			double x = a + i*h + h/2;
			double y = f.function(x);
			sum += y*h; 
		}
		
		return sum;
	}
	
	public static double integral2(DoubleFunction<Double> f, double a, double b) {
		double h = (b-a)/STEPS;
		double sum = 0.0;
		
		for (int i = 0; i < STEPS; i++) {
			double x = a + i*h + h/2;
			double y = f.apply(x);
			sum += y*h; 
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		{// 1. integral of sin(x)
			System.out.println("1. integral of sin(x):");
			double r1 = integralOfSin(0, Math.PI/2);
			System.out.println(r1);
		}
		
		{// 2. integral
			System.out.println("2. integral:");
			class SinFunc implements MathFunc{

				@Override
				public double function(double x) {
					return Math.sin(x);
				}
				
			}
			
			MathFunc f = new SinFunc();
			double r1 = integral(f, 0, Math.PI/2);
			System.out.println(r1);
		}
		
		{// 3.
			System.out.println("3.");
			MathFunc f = new MathFunc() {
				
				@Override
				public double function(double x) {
					return Math.sin(x);
				}
			};
			double r1 = integral(f, 0, Math.PI/2);
			System.out.println(r1);
		}
		
		{// 4.
			System.out.println("4.");
			
			double r1 = integral(new MathFunc() {
				
				@Override
				public double function(double x) {
					return Math.sin(x);
				}
			}, 0, Math.PI/2);
			System.out.println(r1);
		}
		
		{// 5.
			System.out.println("5.");
			
			double r1 = integral( x -> Math.sin(x), 0, Math.PI/2);
			System.out.println(r1);
		}
		
		{// 6.
			System.out.println("6.");
			long l1 = System.currentTimeMillis();
			double r1 = integral( Math::sin, 0, Math.PI/2);
			long l2 = System.currentTimeMillis();
			System.out.println(l2-l1);
			System.out.println(r1);
		}
	}

}
