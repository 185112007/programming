package main;

import threads._01_MyThread;

public class App1 {

	public static void main(String[] args) {
		{// 1. using java.util.concurrent.locks.ReentrantLock
			System.out.println("----1: 1. using java.util.concurrent.locks.ReentrantLock----");
			Thread t0 = new _01_MyThread();
			Thread t1 = new _01_MyThread();
			
			t0.start();
			t1.start();
		}
		
		{// 2. java.util.concurrent.locks.Condition
			System.out.println("----2. java.util.concurrent.locks.Condition:----");
		}
		
		{// 3. readLock() & writeLock()
			System.out.println("----3. readLock() & writeLock():----");
			/*
			 * RR
			 * RW - sync
			 * WW - sync
			 */
		}
	}

}
