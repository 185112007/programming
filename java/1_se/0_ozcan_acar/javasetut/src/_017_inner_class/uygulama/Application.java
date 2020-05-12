package _017_inner_class.uygulama;

import _017_inner_class.arac.Araba;

public class Application {
	public static void main(String[] args) {
		
		Araba araba = new Araba();
		
		araba.setRenk("Siyah");
		
		int beygirGucu = araba.getMotor().getBeygirGucu();
		System.out.println(beygirGucu);
		
	}
	
}
