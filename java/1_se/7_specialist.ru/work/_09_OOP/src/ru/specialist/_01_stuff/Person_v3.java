package ru.specialist._01_stuff;

public class Person_v3 {
	// properties
	public String name;
	public int age;
	
	// constructor
	public Person_v3() {
		this("Unknown");
	}
	public Person_v3(String name) {
		this(name, 18);
	}
	public Person_v3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// methods
	public void show() {
		System.out.printf("%s - %d\n", this.name, this.age);
	}
}
