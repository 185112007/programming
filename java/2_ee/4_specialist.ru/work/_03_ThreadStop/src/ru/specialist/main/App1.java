package ru.specialist.main;

import ru.specialist.threads._01_MyRunnable;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1.
			System.out.println("----1. :----");

			Thread t0 = new Thread(new _01_MyRunnable());

			t0.start();
			Thread.sleep(150);
			t0.interrupt();

			System.out.println("main");
			t0.join();// wait to finish
		}

		{// 2. daemon
			System.out.println("----2. daemon:----");
			Thread t1 = new Thread(new _01_MyRunnable());
			Thread t2 = new Thread(new _01_MyRunnable());
			Thread t3 = new Thread(new _01_MyRunnable());
			Thread t4 = new Thread(new _01_MyRunnable());

			t1.start();
			t2.start();
			
			// jvm don't wait this 3-4 threads to finish
			t3.setDaemon(true);
			t4.setDaemon(true);
			
			t3.start();
			t4.start();
			
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		
		{// 3. priority
			System.out.println("----3. priority:----");
			Thread t5 = new Thread(new _01_MyRunnable());
			Thread t6 = new Thread(new _01_MyRunnable());
			Thread t7 = new Thread(new _01_MyRunnable());
			Thread t8 = new Thread(new _01_MyRunnable());

			t5.setPriority(Thread.MAX_PRIORITY);
			t5.start();
			t6.start();
			
			// jvm don't wait this 3-4 threads to finish
			t7.setDaemon(true);
			t8.setDaemon(true);
			
			t7.start();
			t8.start();
		}
	}

}
