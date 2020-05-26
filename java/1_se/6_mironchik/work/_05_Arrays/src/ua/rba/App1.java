package ua.rba;

public class App1 {

	public static void main(String[] args) {
		int[] c = {1,2,3,4,5};							// in stack
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("--------------------");
		int f[];
		//f = {1,2,3,4,5};
		f = new int[5];									// in heap, default values is 0
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		System.out.println("---------------------");
		char ch[][] = {{'q','w','e'},{'q','w'},{'q'}};	// in stack
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		char t[] = new char[5];							// in heap 
		for (int i = 65; i < 65 + t.length; i++) {
			t[i - 65] = (char)i;
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		
		System.out.println("----------------------");
		char t2[] = new char[] {'a','b','c','d','e'};	// in heap
	}

}
