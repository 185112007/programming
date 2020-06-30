package ru.specialist.main;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1. join
			System.out.println("----1. join:----");

			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t0.start();
			t0.join();// main wait for finish t0

			System.out.println(Thread.currentThread().getName());// main
		}

		{// 2. join 2 threads
			System.out.println("----2. join 2 threads:----");

			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});
			Thread t2 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t1.start();
			t2.start();
			
			t1.join();// main wait for finish t0
			t2.join();

			System.out.println(Thread.currentThread().getName());// main
		}
		
		{// 3. practice join 1
			System.out.println("----3. practice join 1:----");

			Thread t3 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});
			Thread t4 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t3.start();
			t3.join();
			t4.start();
			t4.join();
			System.out.println(Thread.currentThread().getName());
		}
		
		{// 4. practice join 2
			System.out.println("----4. practice join 2:----");

			Thread t5 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});
			Thread t6 = new Thread(() -> {
				try {
					t5.join();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t5.start();
			t6.start();
			t6.join();
			System.out.println(Thread.currentThread().getName());
		}
	}

}
