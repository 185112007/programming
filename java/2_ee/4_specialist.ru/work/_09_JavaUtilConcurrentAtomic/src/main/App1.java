package main;

import java.util.concurrent.atomic.AtomicInteger;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1. AtomicInteger: we do not need synchronization
			System.out.println("----1. AtomicInteger: we do not need synchronization----");

			AtomicInteger counter = new AtomicInteger();
			
			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					counter.incrementAndGet();
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 10000; i++) {
					//System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
					counter.incrementAndGet();
				}
			});

			t0.start();
			t1.start();
			t0.join();
			t1.join();
			System.out.println(counter.get());	// 20000	

			System.out.println(Thread.currentThread().getName());// main
		}
	}

}
