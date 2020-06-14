package ru.specialist._01_stuff;

import java.util.ArrayList;

public class Person_v6 {
	// properties
	public String name;
	public int age;

	// static field(obshee pole dlya vseh obyektov)
	public static int counter; // counts all created objects
	public static ArrayList<Person_v6> persons; // save all created objects into array

	// init static fields
	static {
		counter = 0;
		persons = new ArrayList<>();
	}

	// static methods
	public static void showConter() {
		System.out.printf("total persons: %d\n", Person_v4.counter);
	}
	public static void showAllPersons() {
		for (Person_v6 person : persons) {
			person.show();
		}
	}
	public static Person_v6 create(String name, int age) {
		Person_v6 p = new Person_v6(name, age);
		persons.add(p);
		return p;
	}

	// constructor
	private Person_v6() {
		this("Unknown");
	}

	private Person_v6(String name) {
		this(name, 18);
	}

	private Person_v6(String name, int age) {
		this.name = name;
		this.age = age;
		counter++;
//		persons.add(this);	// bad practice
	}
	
	// methods
	public void show() {
		System.out.printf("%s - %d\n", this.name, this.age);
	}
}
