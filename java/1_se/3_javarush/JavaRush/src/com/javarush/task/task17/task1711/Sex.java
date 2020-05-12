package com.javarush.task.task17.task1711;

public enum Sex {
	MALE("m"), FEMALE("f");

	private final String name;

	private Sex(String s) {
		name = s;
	}

	public String toString() {
		return this.name;
	}
}
