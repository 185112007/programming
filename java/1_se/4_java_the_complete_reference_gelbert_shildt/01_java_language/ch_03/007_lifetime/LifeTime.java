// Prodemonstrirovat srok deystviya peremennoy
class LifeTime{
	public static void main(String args[]){
		int x;

		for(x = 0; x < 3; x++){
			int y = -1;		// peremennaya y inisializiruetsa
							// pri kajdom vhojdenii v blok koda
			System.out.println("y ravno: " + y);
			y = 100;
			System.out.println("y teper ravno: " + y);
		}
	}
}