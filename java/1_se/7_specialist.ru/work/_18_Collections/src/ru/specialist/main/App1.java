package ru.specialist.main;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import ru.specialist.test.Test;

public class App1 {

	public static void main(String[] args) {
		{// 1. Map<K,V>: K - name, V - age
			/*
			 * Hashtable:
			 * 
			 * 	 - Any non-null object can be used as a key or as a value
			 *   - Synchronized, thread-safe
			 * 
			 * HashMap:
			 * 
			 * 	 - permits null values and null keys
			 *   - non-synchronized, non-thread-safe
			 * 
			 */
			System.out.println("----1. Map<K,V>:----");
			Map<String, Integer> persons = new Hashtable<String, Integer>();
			
			persons.put("n1", 39);
			persons.put("n2", 35);
			persons.put("n3", 10);	// K:"n3"
			persons.put("n4", 7);
			
			persons.put("n3", 12);	// update existing person
			
			System.out.println(persons.size());
			
			String name = "n3";
			if (persons.containsKey(name)) {
				int age = persons.get(name);
				System.out.printf("%s - %d\n", name, age);
			}
		}
		
		{ // 2. Stack
			System.out.println("\n----2. Stack:----");
			System.out.println(testString("([sdaf])adsfjk(s)d[()as()](sdf)"));
		}
		
		{// 3. Set
			/*
			 * HashSet:
			 * 		- much faster than TreeSet
			 * 		- no ordering
			 * 
			 * TreeSet
			 * 		- ordered
			 * 
			 * LinkedHashSet
			 * 		- runs nearly as fast as HashSet
			 */
			System.out.println("\n----3. Set:----");
			Set<Test> set = new HashSet<>();
			
			set.add(new Test("one"));
			set.add(new Test("two"));
			set.add(new Test("two"));
			
			System.out.println(set.size());
			for (Test t : set) {
				System.out.println(t.getData());
			}
		}
	}

	private static boolean testString(String s) {
		System.out.printf("%s : ", s);
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[') {
				st.push(ch);
			}
			if (ch == ')'|| ch == ']') {
				if (st.size() == 0) {
					return false;
				}else {
					char p = st.pop();
					if ( !((p == '(' && ch ==')') || (p == '[' && ch == ']')) ) {
						return false;
					}
				}
			}
		}
		return st.size() == 0;
	}

}
