package ru.specialist.main;

import ru.specialist.model._01_SampleObj;
import ru.specialist.model._02_SampleObj;
import ru.specialist.model._03_SampleObj;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1. 
			System.out.println("----1. :----");

			_01_SampleObj obj = new _01_SampleObj();
			
			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.counter++;
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.counter++;
				}
			});

			t0.start();
			t1.start();
			t0.join();
			t1.join();
			System.out.println(obj.counter);	// not 20000

			System.out.println(Thread.currentThread().getName());// main
		}
		
		{// 2. volatile(only volatile cannot synchronize)
			System.out.println("\n----2. volatile(only volatile cannot synchronize):----");

			_02_SampleObj obj = new _02_SampleObj();
			
			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.counter++;
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.counter++;
				}
			});

			t0.start();
			t1.start();
			t0.join();
			t1.join();
			System.out.println(obj.counter);	// not 20000

			System.out.println(Thread.currentThread().getName());// main
		}
		
		{// 3. synchronized block
			System.out.println("\n----3. synchronized block:----");

			_02_SampleObj obj = new _02_SampleObj();
			
			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					synchronized (obj) {
						obj.counter++;
					}
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					synchronized (obj) {
						obj.counter++;
					}
				}
			});

			t0.start();
			t1.start();
			t0.join();
			t1.join();
			System.out.println(obj.counter);	// 20000

			System.out.println(Thread.currentThread().getName());// main
		}
		
		{// 4. synchronized method
			System.out.println("\n----4. synchronized method:----");

			_03_SampleObj obj = new _03_SampleObj();
			
			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.increment();
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					obj.increment();
				}
			});

			t0.start();
			t1.start();
			t0.join();
			t1.join();
			System.out.println(obj.getCounter());	// 20000

			System.out.println(Thread.currentThread().getName());// main
		}
	}

}
