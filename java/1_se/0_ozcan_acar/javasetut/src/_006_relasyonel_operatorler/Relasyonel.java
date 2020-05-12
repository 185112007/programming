package _006_relasyonel_operatorler;

public class Relasyonel {

	public static void main(String[] args) {
		double a = 100;
		double b = 200;
		
		System.out.println("esittir operatoru: " + (a == b));
		System.out.println("esit degildir oper: " + (a != b));
		System.out.println("buyuktur operatoru: " + (a > b));
		System.out.println("buyuktur-esittir operatoru: " + (a >= b));
		System.out.println("kucuktur oper: " + (a < b));
		System.out.println("kucuktur-esittir: " + (a <= b));
		
		b = 100;
		
		System.out.println("kucuktur: " + (a == b));
		
		boolean result = a < b;
		
		System.out.println(result);
	}

}
