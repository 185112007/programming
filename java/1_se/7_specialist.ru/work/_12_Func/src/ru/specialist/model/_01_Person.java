package ru.specialist.model;

public class _01_Person {
	public String name;
	public int age;
	
	@Override
	public String toString() {
		return String.format("%s - %d", name, age);
	}

	public _01_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
