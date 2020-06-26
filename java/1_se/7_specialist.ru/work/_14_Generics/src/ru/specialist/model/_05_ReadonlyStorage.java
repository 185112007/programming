package ru.specialist.model;

public class _05_ReadonlyStorage<T extends Number> {
	private T data;
	
	public _05_ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public boolean isGreater(T x) {
		return data.doubleValue() > x.doubleValue();
	}
	
	public T getData() {
		return data;
	}
}
