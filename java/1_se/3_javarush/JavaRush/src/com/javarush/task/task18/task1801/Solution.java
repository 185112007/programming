package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		scanner.close();
		
		FileInputStream input = new FileInputStream(fileName);
		int maxByte = -1;
		while(input.available()>0) {
			int nextByte = input.read();
			if(nextByte>maxByte) {
				maxByte = nextByte;
			}
		}
		input.close();
		System.out.println(maxByte);
	}

}
