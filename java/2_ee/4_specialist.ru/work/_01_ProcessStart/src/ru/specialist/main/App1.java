package ru.specialist.main;

import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		{// 1. Starting external app
			System.out.println("----1.Starting external app:----");
			
			// creating process
			Runtime.getRuntime().exec("explorer.exe");
		}
	}

}
