package ru.specialist._01_stuff;

public class Person_v4 {
	// properties
	public String name;
	public int age;
	
	// static field(obshee pole dlya vseh obyektov)
	public static int counter;	// counts all created objects
	
	static {
		counter = 0;
	}
	
	// static methods
	public static void showConter() {
		System.out.printf("total persons: %d\n", Person_v4.counter);
	}

	// constructor
	public Person_v4() {
			this("Unknown");
		}

	public Person_v4(String name) {
			this(name, 18);
		}

	public Person_v4(String name, int age) {
			this.name = name;
			this.age = age;
			counter++;
		}

	// methods
	public void show() {
		System.out.printf("%s - %d\n", this.name, this.age);
	}
}
