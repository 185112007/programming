package ru.specialist.strings;

import static java.lang.System.out;

import java.time.Instant;

public class Program {

	public static void main(String[] args) {
		{// 1
			// 1. declaration
			String s1, s2;
			
			// 2. create
			s1 = new String("hello");
			s2 = "hello";
			
			// 3. use
			out.println(s1);
			out.println(s2);
		}
		
		{// 2. concatenation
			String s1 = "hello";
			String s2 = "world";
			String s = s1 + " " + s2 + "!";
			System.out.println(s);
		}
		
		{// 3. string methods
			String s1 = "   hello hel   ";
			System.out.println(s1.length());
			System.out.println(s1.charAt(0));
			System.out.println(s1.charAt(s1.length()-1));
			System.out.println(s1.contains("el"));
			System.out.println(s1.indexOf("ell"));
			System.out.println(s1.lastIndexOf("l"));
			
			// this method creates a new objects
			System.out.println(s1.toUpperCase());
			System.out.println(s1.trim());
			System.out.println(s1.substring(4, 6));
			System.out.println(s1.replace("lo", "llo"));
		}
		
		{// 1
			long start = System.nanoTime();
			String result = "";
			for (int i = 0; i < 100; i++) {
				result += String.valueOf(i) + " ";	// here created 1 + 1 + 1
			}// here total objects = 301
			
			out.println(result);
			long end = System.nanoTime();
			System.out.println(end-start);
		}
		
		{// 2
			long start = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < 100; i++) {
				sb.append(i).append(' ');
			}
			String result = sb.toString();	// total 2 objects
			
			System.out.println(result);
			long end = System.nanoTime();
			System.out.println(end-start);
		}
		
		{// 3
			long start = System.nanoTime();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 100; i++) {
				sb.append(i).append(' ');
			}
			String result = sb.toString();	// total 2 objects
			
			System.out.println(result);
			long end = System.nanoTime();
			System.out.println(end-start);
		}
		
		
	}

}
