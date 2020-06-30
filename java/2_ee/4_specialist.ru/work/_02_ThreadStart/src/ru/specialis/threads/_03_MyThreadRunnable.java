package ru.specialis.threads;

public class _03_MyThreadRunnable implements Runnable {
	
	private int a;
	private int b;
	
	public _03_MyThreadRunnable(int a, int b) {
		setA(a);
		setB(b);
	}
	
	public int getA() {
		return a;
	}

	private void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	private void setB(int b) {
		this.b = b;
	}

	@Override
	public void run() {
		for (int i = getA(); i < getB(); i++) {
			System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
		}
	}
}
