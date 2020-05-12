package _029_collection_yapilari.ex_04;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUygulamasi {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>(100);
		
		set.add(new Integer(1));
		set.add(new Integer(1));
		
		System.out.println(set.size());
		
		System.out.println();
		
		
		//belli bir siraya gore yerlestirmek
		Set<Integer> set2  = new TreeSet<Integer>();
		set2.add(new Integer(100));
		set2.add(new Integer(1));
		set2.add(new Integer(5));
		set2.add(new Integer(101));
		
		for (Integer i : set2) {
			System.out.println(i);
		}
	}

}
