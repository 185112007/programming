package ua.rba;

public class A2 implements I2 {

	@Override
	public void m1() {
		System.out.println("------m1()-----");
	}

	@Override
	public String m2() {
		System.out.println("-----m2()------");
		return null;
	}

}
