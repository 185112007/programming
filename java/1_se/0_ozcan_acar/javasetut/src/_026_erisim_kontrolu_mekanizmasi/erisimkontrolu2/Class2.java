package _026_erisim_kontrolu_mekanizmasi.erisimkontrolu2;

import _026_erisim_kontrolu_mekanizmasi.erisimkontrolu1.Class1;

public class Class2 {
	@SuppressWarnings("unused")
	public void class2Metot() {
		Class1 class1 = new Class1();
//		class1.degisken1 = 100;
//		class1.class1Metot();
		
//		class1.degisken2;
//		class1.class1Metot2();
		
	}
}

//protected
class Class3 extends Class1{
	public void metot() {
//		this.degisken1 = 200;
		this.degisken2 = 100;
		this.class1Metot2();
	}
}