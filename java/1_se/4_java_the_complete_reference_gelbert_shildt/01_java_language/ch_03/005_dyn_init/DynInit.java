// V etom primere demonstriruetsa dinamiceskaya
// inisializasiya peremennyh
class DynInit {
	public static void main(String args[]){
		double a = 3.0, b = 4.0;

		// dinamiceskaya inisializasiya peremennoy c
		double c = Math.sqrt(a * a + b * b);
		System.out.println("Gipotenuza ravna " + c);
	}
}