package ru.specialist.model;

public class _04_ReadonlyStorage<T extends Comparable<T>> {
	private T data;
	
	public _04_ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public boolean isGreater(T x) {
		return data.compareTo(x) > 0;
	}
	
	public T getData() {
		return data;
	}
}
