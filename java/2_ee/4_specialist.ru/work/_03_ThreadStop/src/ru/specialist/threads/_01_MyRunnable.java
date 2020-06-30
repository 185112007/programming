package ru.specialist.threads;

public class _01_MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (Thread.interrupted()) {
				System.out.printf("%s : interrupted\n", Thread.currentThread().getName());
				return;
			}
			System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
		}
	}

}
