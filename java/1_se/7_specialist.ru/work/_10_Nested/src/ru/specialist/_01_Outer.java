package ru.specialist;

import java.util.Comparator;

public class _01_Outer {
	private int data;

	// 1. static nested class
	public static class Nested {
		void increment(_01_Outer o) {
			o.data++;
		}
	}

	// 2. inner class
	public class Inner {
		void increment() {
			data++;
		}
	}

	// 1. nested
	private void useNested() {
		Nested n = new Nested();
		n.increment(this);
	}

	// 3. local class
	public boolean isGreater1(int x) {

		class MyComparator implements Comparator<Integer>{
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		}

		MyComparator c = new MyComparator();

		return c.compare(data, x) > 0;
	}

	// 4. anonymous classes
	public boolean isGreater2(int x) {


		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		};

		return c.compare(data, x) > 0;
	}

	public _01_Outer(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
