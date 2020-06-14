package ru.specialist._01_stuff;

public class Person_v2 {
	
	// properties
	public String name = "Unknown";
	public int age;
	
	{// initialization block of age
		age = name.length();
	}

	// methods
	public void show() {
		System.out.printf("%s - %d\n", this.name, this.age);
	}
}
