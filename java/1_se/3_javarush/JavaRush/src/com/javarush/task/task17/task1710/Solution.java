package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
	public static List<Person> allPeople = new ArrayList<Person>();

	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date())); // сегодня родился id=0
		allPeople.add(Person.createMale("Петров Петр", new Date())); // сегодня родился id=1
	}

	public static void main(String[] args) {
		String key = args[0];
		Date date = null;
		String sex;
		int id;

		switch (key) {
		case "-c":
			insert(args);
			break;
		case "-u":
			update(args);
			break;
		case "-d":
			delete(args);
			break;
		case "-i":
			print(args);
			break;

		default:
			break;
		}
	}

	private static void print(String[] args) {
		Date date;
		int id;
		id = Integer.parseInt(args[1]);
		Person p = allPeople.get(id);
		date = p.getBirthDate();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateString = formatter.format(date);
		System.out.println(p.getName() + " " + p.getSex().toString() + " " + dateString);
	}

	private static void update(String[] args) {
		Date date;
		String sex;
		int id;
		id = Integer.parseInt(args[1]);
		String name = args[2];
		sex = args[3];

		if (sex.equals("m")) {
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);
				Person p = allPeople.get(id);
				p.setSex(Sex.MALE);
				p.setName(name);
				p.setBirthDate(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else if (sex.equals("f")) {
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);
				Person p = allPeople.get(id);
				p.setSex(Sex.FEMALE);
				p.setName(name);
				p.setBirthDate(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	private static void insert(String[] args) {
		Date date;
		String sex;
		sex = args[2];
		if (sex.equals("m")) {
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
				Person p = Person.createMale(args[1], date);
				allPeople.add(p);
				System.out.println(allPeople.indexOf(p));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else if (sex.equals("f")) {
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
				Person p = Person.createFemale(args[1], date);
				allPeople.add(p);
				System.out.println(allPeople.indexOf(p));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	private static void delete(String[] args) {
		int id;
		id = Integer.parseInt(args[1]);
		Person person = allPeople.get(id);
		person.setName(null);
		person.setSex(null);
		person.setBirthDate(null);
	}
}
