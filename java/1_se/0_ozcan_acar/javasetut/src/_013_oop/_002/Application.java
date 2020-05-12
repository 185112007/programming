package _013_oop._002;


public class Application {
	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setMarka("Fiesta");
		araba.setRenk("Siyah");
		
		showMarka(araba);
		showRenk(araba);
	}
	
	static void showMarka(Arac arac) {
		
		System.out.println(arac.getMarka());
	}
	
	static void showRenk(Arac arac) {
		Araba araba = (Araba)arac;// casting
		System.out.println(araba.getRenk());
	}
}
