package ru.specialist.model;

public class _03_SampleObj {
	private volatile int counter;
	
	public synchronized void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
}
