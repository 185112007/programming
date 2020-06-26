package ru.specialist.main;

import ru.specialist.model._01_ReadonlyStorage;
import ru.specialist.model._02_ReadonlyStorage;
import ru.specialist.model._03_ReadonlyStorage;
import ru.specialist.model._04_ReadonlyStorage;
import ru.specialist.model._05_ReadonlyStorage;
import ru.specialist.model._06_ReadonlyStorage;

public class App1 {

	public static void main(String[] args) {
		{// 1.
			System.out.println("----1.");
			_01_ReadonlyStorage r1 = new _01_ReadonlyStorage(10);
			
			System.out.println(r1.getData());
		}
		
		{// 2.
			System.out.println("----2.");
			_02_ReadonlyStorage r1 = new _02_ReadonlyStorage(10);
			_02_ReadonlyStorage r2 = new _02_ReadonlyStorage(5.5);
			_02_ReadonlyStorage r3 = new _02_ReadonlyStorage("abc");
			_02_ReadonlyStorage r4 = new _02_ReadonlyStorage(new App1());
			
			System.out.println(r1.getData());
			System.out.println(r2.getData());
			System.out.println(r3.getData());
			System.out.println(r4.getData());
		}
		
		{// 3.
			System.out.println("----3.");
			_03_ReadonlyStorage<Integer> r1 = new _03_ReadonlyStorage<>(10);
			_03_ReadonlyStorage<Double> r2 = new _03_ReadonlyStorage<>(5.5);
			_03_ReadonlyStorage<String> r3 = new _03_ReadonlyStorage<>("abc");
			_03_ReadonlyStorage<App1> r4 = new _03_ReadonlyStorage<>(new App1());
			
			System.out.println(r1.getData());
			System.out.println(r2.getData());
			System.out.println(r3.getData());
			System.out.println(r4.getData());
		}
		
		{// 4.
			System.out.println("----4.");
			_04_ReadonlyStorage<Integer> r1 = new _04_ReadonlyStorage<>(10);
			_04_ReadonlyStorage<Double> r2 = new _04_ReadonlyStorage<>(5.5);
			_04_ReadonlyStorage<String> r3 = new _04_ReadonlyStorage<>("abc");
//			_04_ReadonlyStorage<App1> r4 = new _04_ReadonlyStorage<>(new App1());
			
			System.out.println(r1.getData());
			System.out.println(r2.getData());
			System.out.println(r3.getData());
//			System.out.println(r4.getData());
		}
		
		{// 5.
			System.out.println("----5.");
			_05_ReadonlyStorage<Integer> r1 = new _05_ReadonlyStorage<>(10);
			_05_ReadonlyStorage<Double> r2 = new _05_ReadonlyStorage<>(5.5);
//			_05_ReadonlyStorage<String> r3 = new _05_ReadonlyStorage<>("abc");
//			_04_ReadonlyStorage<App1> r4 = new _04_ReadonlyStorage<>(new App1());
			
			System.out.println(r1.getData());
			System.out.println(r2.getData());
//			System.out.println(r3.getData());
//			System.out.println(r4.getData());
		}
		
		{// 6.
			System.out.println("----6.");
			_06_ReadonlyStorage<Integer> r1 = new _06_ReadonlyStorage<>(10);
			_06_ReadonlyStorage<Double> r2 = new _06_ReadonlyStorage<>(5.5);
			_06_ReadonlyStorage<String> r3 = new _06_ReadonlyStorage<>("abc");
//			_04_ReadonlyStorage<App1> r4 = new _04_ReadonlyStorage<>(new App1());
			
			System.out.println(r1.getData());
			System.out.println(r2.getData());
			System.out.println(r3.getData());
//			System.out.println(r4.getData());
		}
		
		{// 7.
			System.out.println("----7:");
			System.out.println(isGreater1(10, 7));
			System.out.println(isGreater2(10, 7));
			System.out.println(isGreater2(10.5, 7.5));
			System.out.println(isGreater2("abc", "cde"));
		}
	}

	public static boolean isGreater1(int a, int b) {
		return a>b;
	}
	
	public static <T extends Comparable<? super T>> boolean isGreater2(T a, T b) {
		return a.compareTo(b) > 0;
	}
}
