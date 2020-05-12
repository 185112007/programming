/*
	Prodemonstrirovat primenenie bloka koda
	Prisvoit ishodnomu faylu imya "BlockTest.java"
*/
class BlockTest {
	public static void main(String args[]) {
		int x, y;

		y = 20;

		//	adresatom etogo operatora cikla slujit block koda
		for(x = 0; x < 10; x++){
			System.out.println("Znacenie x: " + x);
			System.out.println("Znacenie y: " + y);
			y = y -2;
		}
	}
}