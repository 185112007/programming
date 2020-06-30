package ru.specialis.threads;

public class _01_MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", getName(), i);
		}
	}
}
