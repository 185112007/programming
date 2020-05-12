package _005_aritmetik_operatorler;

public class Aritmetik {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("toplama:" + (a + b));
		System.out.println("cıkarma:" + (a - b));
		System.out.println("carpma:" + (a * b));
		
		double d1 = 100;
		double d2 = 23;
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		System.out.println("bolme: d1/d2 = " + (d1 / d2));
		
		System.out.println("mod islemi: d1 % d2 = " + (d1 % d2));
		
		System.out.println("increment, a++ = " + (a++));
		System.out.println(a);
		
		System.out.println("increment, ++a = " + (++a));
		System.out.println(a);
		
		System.out.println("decrement, a-- = " + (a--));
		System.out.println(a);
		
		
		System.out.println("decrement, --a = " + (--a));
		System.out.println(a);
	}
}