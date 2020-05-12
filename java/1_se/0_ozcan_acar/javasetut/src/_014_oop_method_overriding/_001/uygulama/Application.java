package _014_oop_method_overriding._001.uygulama;

import _014_oop_method_overriding._001.arac.Araba;

public class Application {
	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setMarka("Fiesta");
		araba.setRenk("Siyah");
		
		System.out.println(araba.getMarka());
		
	}
	
}
