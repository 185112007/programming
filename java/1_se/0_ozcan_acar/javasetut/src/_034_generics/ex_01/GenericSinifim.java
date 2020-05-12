package _034_generics.ex_01;

import java.util.ArrayList;
import java.util.List;

public class GenericSinifim {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		//1.
		List list = new ArrayList();
		list.add("test");
		list.add(1);
		
		for (Object object : list) {
			if (object instanceof String) {
				String str = (String)object;
			}else if(object instanceof Integer) {
				Integer inte = (Integer)object;
			}
		}
		
		//2.
		List<String> list2 = new ArrayList<String>();
		list2.add("test");
		//list2.add(1);
		list2.add("1");
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
