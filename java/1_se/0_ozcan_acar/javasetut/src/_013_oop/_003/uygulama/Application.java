package _013_oop._003.uygulama;

import _013_oop._003.arac.Araba;

public class Application {
	public static void main(String[] args) {
		Araba araba = new Araba();
		Araba araba2 = new Araba();
		
		showModel(araba);
		araba.setModel("Focus");
		showModel(araba);
		
		showMarka(araba);
		showMarka(araba2);
		showRenk(araba);
		
	}
	
	static void showMarka(Araba araba) {
		System.out.println(araba.getMarka());
	}
	
	static void showModel(Araba araba) {
		System.out.println(araba.getModel());
	}
	
	static void showRenk(Araba araba) {
		System.out.println(araba.getRenk());
	}
}
