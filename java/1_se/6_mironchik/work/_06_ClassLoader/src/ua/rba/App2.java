package ua.rba;

public class App2 {

	public static void main(String[] args) {
		// 1. call B2, B2 loaded but inner B11 is not loaded
		//B2.m1(3, 4);
		
		// 2. load inner class
		System.out.println(B2.B21.info());
		
		// 3. we cannot call private inner class
		//System.out.println(B2.B22.info());
		System.out.println(B2.m2(10, 20));
		
	}

} 
