package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/* 
Сортировка байт
*/

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();

		HashSet<Integer> mySet = new HashSet<>();

		FileInputStream input = new FileInputStream(filename);
		while (input.available() > 0) {
			mySet.add(input.read());
		}
		input.close();

		ArrayList<Integer> list = new ArrayList<>(mySet);
		
		Collections.sort(list);
		
		list.stream().forEach(x -> System.out.print(x + " "));
	}
}
