package links;

public class Links {

	public static void main(String[] args) {
//		arraysEx1();
		
//		linkEx2();
		
//		Link A = new Link();
//		A.number = 100;
//		
//		funcEx3(A);
//		System.out.println(A.number);
		
		String a = new String("A");
		String b = a;
		a = "AA";
		System.out.println(a); //a = "AA"
		System.out.println(b); //b = "A"
	}
	
	private static void funcEx3(Link link) {
		link.number = 300;
	}

	private static void linkEx2() {
		Link A = new Link();
		A.number = 100;
		System.out.println(A.number);
		
		Link B = A;
		System.out.println(B.number);
		
		B.number = 200;
		System.out.println(A.number);
	}

	private static void arraysEx1() {
		int first[];
		int second[];
		
		first = new int[10];
		second = first;
		
		for (int i = 0; i < first.length; i++) {
			first[i] = i;
		}
		
		System.out.println("First:");
		for (int i = 0; i < first.length; i++) {
			System.out.println(first[i]);
		}
		
		System.out.println("Second:");
		for (int i = 0; i < first.length; i++) {
			System.out.println(second[i]);
		}
		
		first[5] = 100;
		System.out.println("First:");
		for (int i = 0; i < first.length; i++) {
			System.out.println(first[i]);
		}
		
		System.out.println("Second:");
		for (int i = 0; i < first.length; i++) {
			System.out.println(second[i]);
		}
	}

}
