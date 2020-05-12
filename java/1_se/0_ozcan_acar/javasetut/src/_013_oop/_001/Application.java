package _013_oop._001;

public class Application {
	public static void main(String[] args) {
		Araba araba = new Araba("Ford", "Fiesta", 2014, "Beyaz");
		Araba araba2 = new Araba("Audi", "R8", 2018, "Siyah");
		
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
