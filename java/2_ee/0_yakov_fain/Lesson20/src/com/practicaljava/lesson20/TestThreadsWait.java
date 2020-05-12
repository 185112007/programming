package com.practicaljava.lesson20;

public class TestThreadsWait {
	public static void main(String args[]) {

		MarketNews3 mn = new MarketNews3("Market News");
		mn.start();

		Portfolio3 p = new Portfolio3("Portfolio data");
		p.start();

		Object theLockKeeper = new Object();
		synchronized (theLockKeeper) {
			System.out.println("Starting to wait...");
			try {
				theLockKeeper.wait(15000);
			} catch (InterruptedException e) {
				System.out.println("The main thread is interrupted");
			}
		}
		
		System.out.println("The main method of TestThreads3 is finished");
	}
}
