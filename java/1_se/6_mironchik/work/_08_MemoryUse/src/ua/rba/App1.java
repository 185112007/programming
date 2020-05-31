package ua.rba;

public class App1 {

	public void info() {
		
		System.out.println("------info------");
		long start = Runtime.getRuntime().freeMemory();			// free heap memory
		System.out.println("memory: " + (start));
		
		A1 a1 = null;
		
		for (int i = 0; i < 100; i++) {
			//Runtime.getRuntime().gc();
			a1 = new A1("" + i);
		}
		long end = Runtime.getRuntime().freeMemory();
		System.out.println("used memory: " + (start-end));
	}
	
	public static void main(String[] args) {
		// 1.
		App1 app1 = new App1();
		
		// 2.
		app1.info();
		
	}

}
