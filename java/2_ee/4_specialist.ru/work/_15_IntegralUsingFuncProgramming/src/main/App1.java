package main;

import java.util.concurrent.ExecutionException;

import util.Integral;

public class App1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		{// 1. single thread
			System.out.println("----1. single thread:----");
			long t1 = System.currentTimeMillis();
			double r1 = Integral.singleThread(Math::sin, 0, Math.PI/2);
			long t2 = System.currentTimeMillis();
			
			System.out.printf("Single thread : %f, Time: %d\n", r1, t2-t1);
		}
		
		{// 2. multy thread
			System.out.println("----2. multy thread:----");
			long t1 = System.currentTimeMillis();
			double r1 = Integral.multyThread(Math::sin, 0, Math.PI/2);
			long t2 = System.currentTimeMillis();
			
			System.out.printf("Muty thread : %f, Time: %d\n", r1, t2-t1);
		}
		
		{// 3. multy thread 2
			System.out.println("----3. multy thread 2:----");
			long t1 = System.currentTimeMillis();
			double r1 = Integral.multyThread2(Math::sin, 0, Math.PI/2);
			long t2 = System.currentTimeMillis();
			
			System.out.printf("Muty thread 2: %f, Time: %d\n", r1, t2-t1);
		}
		
		{// 4. multy thread 3
			System.out.println("----4. multy thread 3:----");
			long t1 = System.currentTimeMillis();
			double r1 = Integral.multyThread3(Math::sin, 0, Math.PI/2);
			long t2 = System.currentTimeMillis();
			
			System.out.printf("Muty thread 3: %f, Time: %d\n", r1, t2-t1);
		}
	}

}
