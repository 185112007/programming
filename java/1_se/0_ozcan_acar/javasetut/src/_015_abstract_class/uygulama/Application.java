package _015_abstract_class.uygulama;

import _015_abstract_class.arac.Araba;
import _015_abstract_class.arac.Arac;
import _015_abstract_class.arac.Bisiklet;

public class Application {
	public static void main(String[] args) {
		Arac arac = new Araba();
		Araba araba = new Araba();
		
		//1.
		araba.drive();
		
		System.out.println();
		
		//2.
		arac.drive();
		
		System.out.println();
		
		//3.polimorphizm
		arac = new Bisiklet();
		arac.drive();
	}
	
}
