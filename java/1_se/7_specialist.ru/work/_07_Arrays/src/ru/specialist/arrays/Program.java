package ru.specialist.arrays;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		{// 1.
			out.println("----1:");
			// declaration, nums is a reference
			int[] nums;

			// init
			nums = new int[3];

			// indexing
			nums[0] = 10;
			nums[1] = 123;

			out.println(nums[0]);
			out.println(nums[1]);
			out.println(nums[2]);
		}

		{// 2.
			out.println("----2:");
			// declaration
			int[] nums;

			// init
			nums = new int[] { 10, 123, 0 };

			out.println(nums[0]);
			out.println(nums[1]);
			out.println(nums[2]);
		}

		{// 3.
			out.println("----3:");
			int[] nums = { 10, 123, 0 };

			out.println(nums[0]);
			out.println(nums[1]);
			out.println(nums[2]);
		}
		
		{//  4. array.length
			out.println("----4:");
			int[] nums = { 10, 123, 0 };
			out.println("nums.length = " + nums.length);
		}
		
		{//  5. loops in arrays
			out.println("----5:");
			int[] nums = { 10, 123, 0 };
			for (int i = 0; i < nums.length; i++) {
				out.println(nums[i]);
			}
		}
		
		{// 6. create 4 string references & init null
			out.println("----6:");
			String[] names = new String[4];
			out.println(names.length);
		}
		
		{// 7. create string references & init 
			out.println("----7:");
			String[] names = new String[] {"gafur", "g", "h"};
			for (int i = 0; i < names.length; i++) {
				out.println(names[i]);
			}
		}
		
		{// 8. multidimantional arrays
			out.println("----8:");
			int[][] matrix = 
				{
						{1,2,3},
						{4,5}
				};
			out.println(matrix.length);
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					out.printf("%-4d", matrix[i][j]);
				}
				out.print("\n");
			}
		}
		
		{// 9. using java.util.Arrays
			out.println("----9. using java.util.Arrays:");
			String[] names = new String[] {"gafur", "g", "h"};
			Arrays.sort(names);
			for (int i = 0; i < names.length; i++) {
				out.println(names[i]);
			}
		}
		
		{// 10. using java.util.ArrayList
			out.println("----10. using java.util.ArrayList:");
			ArrayList<String> persons = new ArrayList<>();
			out.println(persons.size());
			
			persons.add("Gafur");
			persons.add("Dasha");
			persons.add("Glasha");
			out.println(persons.size());
			
			for (int i = 0; i < persons.size(); i++) {
				out.println(persons.get(i));
			}
			
			// set
			persons.set(1, "Yulya");
			out.println("after change:");
			for (int i = 0; i < persons.size(); i++) {
				out.println(persons.get(i));
			}
			
			// remove
			persons.remove(0);
			out.println("after remove:");
			for (int i = 0; i < persons.size(); i++) {
				out.println(persons.get(i));
			}
		}
		
		{// 11. using java.util.Iterator
			out.println("----11. using java.util.Iterator:");
			ArrayList<String> persons = new ArrayList<>();
			
			persons.add("Gafur");
			persons.add("Dasha");
			persons.add("Glasha");
			
			// 1. while
			Iterator<String> iter = persons.iterator();
			while(iter.hasNext()) {
				String s = iter.next();
				out.println(s);
			}
			
			// 2. foreach
			for (String string : persons) {
				out.println(string);
			}
		}
		
		{// 12. Collections
			out.println("----12. using java.util.Collections:");
			ArrayList<String> persons = new ArrayList<>();
			
			persons.add("Gafur");
			persons.add("Dasha");
			persons.add("Glasha");
			
			Collections.sort(persons);
			for (String string : persons) {
				out.println(string);
			}
		}
	}

}
