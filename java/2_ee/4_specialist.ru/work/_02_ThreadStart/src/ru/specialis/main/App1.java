package ru.specialis.main;

import ru.specialis.threads._01_MyThread;
import ru.specialis.threads._02_MyThreadRunnable;
import ru.specialis.threads._03_MyThreadRunnable;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1. currentThread
			System.out.println("----1. currentThread:----");
			System.out.println(Thread.currentThread().getName());
		}

		{// 2. MyThread
			System.out.println("----2. MyThread:----");

			_01_MyThread t0 = new _01_MyThread();
			t0.start();
			t0.join(); // Waits for this thread to die.
		}

		{// 3. two threads
			System.out.println("----3. two threads:----");

			_01_MyThread t0 = new _01_MyThread();
			_01_MyThread t1 = new _01_MyThread();

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}

		{// 4. Runnable interface
			System.out.println("----4. Runnable interface:----");

			Thread t0 = new Thread(new _02_MyThreadRunnable());
			Thread t1 = new Thread(new _02_MyThreadRunnable());

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}

		{// 5. Runnable interface: anonymous class
			System.out.println("----5. Runnable interface: anonymous class:----");

			Thread t0 = new Thread(new _02_MyThreadRunnable());
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 100; i++) {
						System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					}
				}
			});

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}

		{// 6. Runnable interface: lambda expression
			System.out.println("----6. Runnable interface: lambda expression:----");

			Thread t0 = new Thread(new _02_MyThreadRunnable());
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}
		
		{// 7. Runnable interface: practice
			System.out.println("----7. Runnable interface: practice:----");

			Thread t0 = new Thread(new _03_MyThreadRunnable(0, 10));
			Thread t1 = new Thread(new _03_MyThreadRunnable(3, 50));

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}
		
		{// 8. Runnable interface: practice lambda
			System.out.println("----8. Runnable interface: practice lambda:----");

			// must be a final(Java 7) || don't change these local variables(Java 8)
			final int a = 200;
			final int b = 250;
			Thread t0 = new Thread(() -> {
				for (int i = a; i < b; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});
			Thread t1 = new Thread(new _03_MyThreadRunnable(3, 50));

			t0.start();
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
		}
		
		{// 9. gesState
			System.out.println("----9. gesState:----");
			
			Thread t0 = new Thread(new _02_MyThreadRunnable());
			Thread t1 = new Thread(new _02_MyThreadRunnable());
			
			System.out.println(t0.getState());	// NEW
			
			t0.start();
			System.out.println(t0.getState());	// RUNNABLE
			t1.start();

			// Waits for these threads to die.
			t0.join();
			t1.join();
			System.out.println(t0.getState());	// TERMINATED
		}
	}

}
