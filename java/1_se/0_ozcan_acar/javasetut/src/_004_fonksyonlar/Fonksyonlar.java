package _004_fonksyonlar;

public class Fonksyonlar {
	
	static void buBirFonksyondur() {
		System.out.println("Ben bir fonksyonum");
	}
	
	static void parametreKabulEdenFonksyonOrnegi(int a,int b) {
		System.out.println(a);
	}
	
	static int rakamGeriVerir() {
		int a = 1000;
		System.out.println("rakam geri verir fonksyonu:" + a);
		return a;
	}
	
	public static void main(String[] args) {
		//1.step
		/*System.out.println("Main metodu.....");
		
		buBirFonksyondur();
		
		int a = rakamGeriVerir();
		int x = 2000;
		parametreKabulEdenFonksyonOrnegi(a, x);*/
		
		//2.step
		Fonksyonlar_2.merhabaDunya();
		
		//3.step
		//Fonksyonlar_2.privateMerhabaDunya();
	}
}
