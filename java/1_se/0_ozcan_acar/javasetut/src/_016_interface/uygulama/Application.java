package _016_interface.uygulama;


import _016_interface.arac.Araba;
import _016_interface.arac.AracInterface;
import _016_interface.arac.Bisiklet;

public class Application {
	public static void main(String[] args) {
		AracInterface arac = new Araba();
		arac.drive();
		
		System.out.println();
		
		arac = new Bisiklet();
		arac.drive();
		
	}
	
}
