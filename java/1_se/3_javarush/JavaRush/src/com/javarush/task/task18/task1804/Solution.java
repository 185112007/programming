package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();

		int bytes[] = new int[Byte.MAX_VALUE];

		FileInputStream input = new FileInputStream(filename);
		while (input.available() > 0) {
			bytes[input.read()]++;
		}
		input.close();

		int min = Byte.MAX_VALUE;
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] < min && bytes[i]!=0) {
				min = bytes[i];
			}
		}
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] == min) {
				System.out.print(i + " ");
			}
		}
	}

}
