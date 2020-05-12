package _007_lojik_operatorler;

public class Lojik {

	public static void main(String[] args) {
		double a = 100;
		double b = 200;
		
		boolean result = a < b;
		boolean result2 = a == b;
		
		System.out.println("not operator: " + !result);
		System.out.println("lojik VE operatoru: " + (result && result2));
		System.out.println("lojik VEYA operatoru: " + (result || result2));
	}

}
