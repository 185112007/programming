// Prodemonstrirovat primenenie znaceniy tipa boolean
class BoolTest {
	public static void main(String args[]){
		boolean b;

		b = false;
		System.out.println("b ravno " + b);
		b = true;
		System.out.println("b ravno " + b);

		// znacenie tipa boolean mojet upravlyat 
		// operatorom if
		if (b)
			System.out.println("Etot kod vypolnyaetsa.");
		b = false;
		if (b)
			System.out.println("Etot kod ne vypolnyaetsa.");

		// rezultat sravneniya - znacenie tipa boolean
		System.out.println("10 > 9 ravno " + (10 > 9));
	}
}