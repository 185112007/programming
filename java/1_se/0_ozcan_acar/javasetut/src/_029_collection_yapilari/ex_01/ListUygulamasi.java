package _029_collection_yapilari.ex_01;

import java.util.ArrayList;
import java.util.List;

public class ListUygulamasi {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		//1.
		List liste = new ArrayList();
		liste.add(new Integer(1));
		liste.add(new String("test"));
		
		for (Object object : liste) {
			
			//3.
			if(object instanceof Integer) {
				System.out.println(((Integer)object).intValue());
			}else if(object instanceof String) {
				System.out.println(((String)object));
			}
			
			//1.
			//System.out.println(object.toString());
		}
		System.out.println();
		
		//4.liste icinde yer alacak veri tiplerini belirtmek
		List<String> liste2  = new ArrayList<String>();
		liste2.add(new String("test1"));
		liste2.add(new String("test2"));
		liste2.add(new String("test3"));
		
		System.out.println(liste2.size());
		for (String string : liste2) {
			System.out.println(string);
		}
		
		System.out.println("\nfor dongusu:");
		//5.for dongusu
		for (int i = 0; i < liste2.size(); i++) {
			System.out.println(liste2.get(i));
		}
		
		//6.silme
		liste2.remove(0);
		System.out.println(liste2.size());
		
		//7. tum elemanlari silme
		System.out.println();
		liste2.clear();
		System.out.println(liste2.size());
		
		//8.bos olup olmadıgını kontrol etmek
		System.out.println();
		System.out.println(liste2.isEmpty());
		
		//9.set metodu kulanımı
		System.out.println();
		liste2.add(0, "test");
		liste2.set(0, "yeni test");
		for (String string : liste2) {
			System.out.println(string);
		}
	}

}
