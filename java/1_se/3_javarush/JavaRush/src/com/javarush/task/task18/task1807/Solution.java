package com.javarush.task.task18.task1807;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/* 
Подсчет запятых
*/
public class Solution {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		scanner.close();
		
		FileInputStream input = new FileInputStream(fileName);
		int counter=0;
		while (input.available() > 0) {
			if(input.read()==44) {
				counter++;
			}
		}
		input.close();
		
		System.out.println(counter);
	}

}
