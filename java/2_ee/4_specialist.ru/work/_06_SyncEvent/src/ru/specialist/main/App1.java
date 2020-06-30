package ru.specialist.main;

import ru.specialist.model._01_Sample;
import ru.specialist.model._02_Sample;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		{// 1.
			System.out.println("\n----1. :----");

			Thread t0 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});
			Thread t1 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t0.start();
			t1.start();

			// main wait these threads
			t0.join();
			t1.join();

			System.out.println(Thread.currentThread().getName());// main
		}

		{// 2. wait & notify
			System.out.println("\n----2. wait & notify:----");

			Object obj = new Object();

			Thread t2 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);

					if (i == 50) {
						synchronized (obj) {
							obj.notify();
						}
					}

				}
			});
			Thread t3 = new Thread(() -> {

				try {
					synchronized (obj) {
						obj.wait();
					}
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}

				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t2.start();
			t3.start();

			// main wait these threads
			t2.join();
			t3.join();

			System.out.println(Thread.currentThread().getName());// main
		}

		{// 3. wait & notify if t2 isn't started?
			System.out.println("\n----3. wait & notify if t2 isn't started?:----");

			Object obj = new Object();

			Thread t4 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);

					if (i == 50) {
						synchronized (obj) {
							obj.notify();
						}
					}

				}
			});
			Thread t5 = new Thread(() -> {

				try {
					synchronized (obj) {
						// was called after obj.notify() finished
						obj.wait();
					}
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}

				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t4.start();
//			Thread.sleep(500);
			t5.start();

			// main wait these threads
			t4.join();
			t5.join();

			System.out.println(Thread.currentThread().getName());// main
		}

		{// 4.
			System.out.println("\n----4. :----");

			_01_Sample obj = new _01_Sample();

			Thread t6 = new Thread(() -> {
				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);

					synchronized (obj) {
						obj.counter = i;
						obj.notify();
					}

				}
			});
			Thread t7 = new Thread(() -> {

				try {
					synchronized (obj) {
						while (obj.counter < 50) {
							obj.wait();
						}
					}
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}

				for (int i = 0; i < 100; i++) {
					System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
				}
			});

			t6.start();
			Thread.sleep(500);
			t7.start();

			// main wait these threads
			t6.join();
			t7.join();

			System.out.println(Thread.currentThread().getName());// main
		}

		{// 5. deadlock
			System.out.println("\n----5. deadlock:----");

//			Thread.currentThread().join();// main waits main
		}

		{// 6. practice
			System.out.println("\n----6. :----");

			_02_Sample obj = new _02_Sample();

			Thread t8 = new Thread(() -> {
				for (int i = 0; i < 10; i++) {

					synchronized (obj) {
						while (!obj.isSin) {
							try {
								obj.wait();
							} catch (InterruptedException e) {
								System.out.println(e.getMessage());
							}
						}
						obj.x = Math.sin(obj.x);
						System.out.println(Thread.currentThread().getName() + ", x:" + obj.x);
						obj.isSin = false;
						obj.notify();
					}

				}
			});
			Thread t9 = new Thread(() -> {

				for (int i = 0; i < 10; i++) {
					try {
						synchronized (obj) {
							while (obj.isSin) {
								obj.wait();
							}
							obj.x = Math.asin(obj.x);
							System.out.println(Thread.currentThread().getName() + ", x:" + obj.x);
							obj.isSin = true;
							obj.notify();
						}
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			});

			t8.start();
			t9.start();

			// main wait these threads
			t8.join();
			t9.join();

			System.out.println(Thread.currentThread().getName());// main
		}
	}

}
