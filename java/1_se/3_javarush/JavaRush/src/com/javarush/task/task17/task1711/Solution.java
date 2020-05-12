package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
	public static volatile List<Person> allPeople = new ArrayList<Person>();

	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date())); // сегодня родился id=0
		allPeople.add(Person.createMale("Петров Петр", new Date())); // сегодня родился id=1
	}

	public static void main(String[] args) {

		switch (args[0]) {
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
		for (int i = 1; i < args.length&&i<allPeople.size(); i++) {
			id = Integer.parseInt(args[i]);
			Person p = allPeople.get(id);
			date = p.getBirthDate();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			String dateString = formatter.format(date);
			System.out.println(p.getName() + " " + p.getSex().toString() + " " + dateString);
		}
	}

	private static void update(String[] args) {
		Date date;
		String sex;
		int id;
		
		for (int i = 1; i < args.length; i=i+4) {
			id = Integer.parseInt(args[i]);
			String name = args[i+1];
			sex = args[i+2];

			if (sex.equals("m")) {
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(args[i+3]);
					Person p = allPeople.get(id);
					p.setSex(Sex.MALE);
					p.setName(name);
					p.setBirthDate(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} else if (sex.equals("f")) {
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(args[i+3]);
					Person p = allPeople.get(id);
					p.setSex(Sex.FEMALE);
					p.setName(name);
					p.setBirthDate(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void insert(String[] args) {
		Date date;
		String sex;
		for (int i = 1; i < args.length; i=i+3) {
			sex = args[i + 1];
			if (sex.equals("m")) {
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2]);
					Person p = Person.createMale(args[i], date);
					allPeople.add(p);
					System.out.println(allPeople.indexOf(p));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} else if (sex.equals("f")) {
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2]);
					Person p = Person.createFemale(args[i], date);
					allPeople.add(p);
					System.out.println(allPeople.indexOf(p));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void delete(String[] args) {
		int id;
		for (int i = 1; i < args.length; i++) {
			id = Integer.parseInt(args[i]);
			Person person = allPeople.get(id);
			person.setName(null);
			person.setSex(null);
			person.setBirthDate(null);
		}
	}
}
