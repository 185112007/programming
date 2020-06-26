package ru.specialist.model;

public class _06_ReadonlyStorage<T extends Comparable<? super T>> {
													// libo T ili ego roditelyami
	private T data;
	
	public _06_ReadonlyStorage(T data) {
		this.data = data;
	}
	
	public boolean isGreater(T x) {
		return data.compareTo(x) > 0;
	}
	
	public T getData() {
		return data;
	}
}
