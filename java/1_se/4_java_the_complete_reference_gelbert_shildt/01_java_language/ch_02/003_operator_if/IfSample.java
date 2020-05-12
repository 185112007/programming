/*
   	Prodemonstrirovat primenenie uslovnogo operatora if.
	Prisvoit ishodnomu faylu imya "IfSample.java"
*/
class IfSample {
	public static void main(String args[]) {
		int x, y;

		x = 10;
		y = 20;

		if(x < y) System.out.println("x menshe y");

		x = x * 2;
		if(x == y) System.out.println("x teper ravno y");

		x = x * 2;
		if(x > y) System.out.println("x teper bolshe y");

		// etot operator ne budet nicego vyvodit
		if(x == y) System.out.println("vy ne uvidite etogo");
	}
}