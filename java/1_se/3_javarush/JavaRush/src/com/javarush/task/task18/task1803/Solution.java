package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();
		
		int bytes[] = new int[Byte.MAX_VALUE];
		
		FileInputStream input = new FileInputStream(filename);
		while(input.available()>0) {
			bytes[input.read()]++;
		}
		input.close();
		
		int index = 0;
		int max = bytes[index];
		for (int i = 1; i < bytes.length; i++) {
			if(bytes[i]>max) {
				max = bytes[i];
			}
		}
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i]>1) {
				System.out.print(i + " ");
			}
		}
		
	}

}
