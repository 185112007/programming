// Prodemonstrirovat oblast vidimosti bloka koda
class Scope{
	public static void main(String args[]){
		int x;		// eta peremennaya dostupna vsemu
					// kodu iz metoda main()
		x = 10;
		if (x == 10){	// nacalo novoy oblasti vidimosti
			int y = 20; // 

			System.out.println("x i y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; 	// OSHIBKA! peremennaya y nedostupna
		System.out.println("x ravno " + x);
	}
}