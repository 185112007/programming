package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();
		
		FileInputStream input = new FileInputStream(filename);
		int minByte = Integer.MAX_VALUE;
		while(input.available()>0) {
			int nextByte = input.read();
			if(nextByte<minByte) {
				minByte = nextByte;
			}
		}
		input.close();
		System.out.println(minByte);
	}

}
