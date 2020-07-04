package main;

import java.util.ArrayList;
import java.util.Collections;

public class App1 {

	public static void main(String[] args) {
		// 1. IMPERATIVE PROGRAMMING
		{// 1. print all
			System.out.println("----1.1. print all:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			for (Integer k : nums) {
				System.out.println(k);
			}
		}
		
		{// 2. print if num > 0
			System.out.println("----1.2. print if number > 0:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			for (Integer k : nums) {
				if (k>0) {
					System.out.println(k);
				}
			}
		}
		
		{// 3. print if num > 0 &  sorted
			System.out.println("----1.3. print if number > 0 & sort:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (Integer k : nums) {
				if (k>0) {
					result.add(k);
				}
			}
			Collections.sort(result);
			
			for (Integer k : result) {
				System.out.println(k);
			}
		}
		
		// 2. FUNCTIONAL PROGRAMMING
		{// 2.1. print all
			System.out.println("----2.1. print all:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			nums.stream().forEach((num)->{
				System.out.println(num);
			});
			//or
//			nums.stream().forEach(System.out::println);
		}
		
		{// 2.2. print if num > 0
			System.out.println("----2.2. print if number > 0:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			nums.stream().filter((x) -> x > 0).forEach(System.out::println);
		}
		
		{// 2.3. print if num > 0 &  sorted
			System.out.println("----2.3. print if number > 0 & sort:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			nums.stream().
				filter((x) -> x > 0).
				sorted().
				forEach(System.out::println);
		}
		
		{// 2.4. print if num > 0 &  sorted & parallelStream
			System.out.println("----2.4. print if number > 0 & sort:----");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			nums.add(3);
			nums.add(-2);
			nums.add(1);
			
			nums.parallelStream().		// after that work parallel
				filter((x) -> x > 0).
				sequential().			// after that work sequential
				sorted().
				forEach(System.out::println);
		}
	}

}
