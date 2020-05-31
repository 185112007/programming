package ua.rba;

public class App1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1000; i++) {
			A1 a = A1.getInstance();
			System.out.println(a);
		}
	}

}
