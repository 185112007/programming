package ru.specialist.main;

import java.util.ArrayList;
import java.util.Collections;

import ru.specialist.model._01_Person;

public class App1 {

	public static void main(String[] args) {
		ArrayList<_01_Person> persons = new ArrayList<_01_Person>();

		persons.add(new _01_Person("g3", 40));
		persons.add(new _01_Person("g4", 7));
		persons.add(new _01_Person("g1", 11));
		persons.add(new _01_Person("g2", 35));

		// 1.
		System.out.println("1. normal:");
		for (_01_Person p : persons) {
			System.out.println(p);
		}

		// functional stil
		System.out.println("functional stil:");
		persons.stream().forEach((p) -> System.out.println(p));
		// or
		System.out.println("or:");
		persons.stream().forEach(System.out::println);

		// 2. print if age>=18
		System.out.println("2. normal:");
		for (_01_Person p : persons) {
			if (p.age >= 18) {
				System.out.println(p);
			}
		}

		// functional stil
		System.out.println("functional stil:");
		persons.stream().filter((p) -> p.age >= 18).forEach((p) -> System.out.println(p));
		// or
		persons.stream().filter((p) -> p.age >= 18).forEach(System.out::println);

		// 3.sort
		System.out.println("3. normal stil:");
		ArrayList<_01_Person> result = new ArrayList<_01_Person>();
		for (_01_Person p : persons) {
			if (p.age >= 18) {
				result.add(p);
			}
		}
		Collections.sort(result, (p1, p2) -> p1.name.compareTo(p2.name));
		for (_01_Person p : result) {
			System.out.println(p);
		}

		// funtional stil
		System.out.println("functional stil:");
		persons.stream().filter((p) -> p.age >= 18).sorted((p1, p2) -> p1.name.compareTo(p2.name))
				.forEach((p) -> System.out.println(p));

		// 4. parallel stream
		System.out.println("4. parallel stream:");
		persons.parallelStream()
			.filter((p) -> p.age >= 18)
			.sequential()
			.sorted((p1, p2) -> p1.name.compareTo(p2.name))
			.forEach((p) -> System.out.println(p));
		
		// 5. map()
		System.out.println("5.map():");
		System.out.println("4. parallel stream:");
		persons.parallelStream()
			.filter((p) -> p.age >= 18)
			.sequential()
			.sorted((p1, p2) -> p1.name.compareTo(p2.name))
			.map(p -> p.name)
			.forEach((p) -> System.out.println(p));
	}

}
