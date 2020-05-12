package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static List<String> allLines = new ArrayList<String>();
	public static List<String> forRemoveLines = new ArrayList<String>();

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String file1 = input.nextLine();
		String file2 = input.nextLine();
		input.close();
		
		readFile(file1, allLines);
		readFile(file2, forRemoveLines);
		try {
			new Solution().joinData();
		} catch (CorruptedDataException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(String file1, List<String> allLines) {
		Reader reader1 = null;
		BufferedReader bufferedReader=null;
		try {
			reader1 = new FileReader(file1);
			
			bufferedReader = new BufferedReader(reader1);
			String line = bufferedReader.readLine();
			
			while (line!=null) {
				allLines.add(line);
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void joinData() throws CorruptedDataException {
		if(allLines.containsAll(forRemoveLines)) {
			allLines.removeAll(forRemoveLines);
		}else {
			allLines.clear();
			throw new CorruptedDataException();
		}
	}
}
