package ru.specialist.model;

public class _03_ReadonlyStorage<T> {
	private T data;
	
	public _03_ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
}
