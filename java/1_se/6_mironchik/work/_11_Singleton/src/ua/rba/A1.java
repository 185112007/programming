package ua.rba;

public class A1 {
	
	private static A1 instance = null;	// 2. step
	private long id;
	
	private A1() {						// 1. step singleton realization
		id = System.currentTimeMillis() + (long)(Math.random()*1000);
		System.out.println("create instance. id=" + id);
	}

	public static A1 getInstance() {	// 3. step
		if(instance == null) {
			instance = new A1();
		}
		return instance;
	}
	
	@Override
	public String toString() {
		return "Singleton A1 id=" + id;
	}
}
