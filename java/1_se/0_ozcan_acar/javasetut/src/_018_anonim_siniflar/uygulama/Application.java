package _018_anonim_siniflar.uygulama;

import _018_anonim_siniflar.arac.AracInterface;

public class Application {
	public static void main(String[] args) {
		
		AracInterface arac = new AracInterface() {
			
			@Override
			public void drive() {
				System.out.println("driving....");
				
			}
		};
		
		arac.drive();
		
	}
	
}
