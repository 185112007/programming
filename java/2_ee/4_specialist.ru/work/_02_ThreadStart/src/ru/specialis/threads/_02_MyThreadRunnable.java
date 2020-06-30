package ru.specialis.threads;

public class _02_MyThreadRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
		}
	}
}
