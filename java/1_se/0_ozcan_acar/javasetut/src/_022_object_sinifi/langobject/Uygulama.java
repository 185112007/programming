package _022_object_sinifi.langobject;

public class Uygulama {

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		
		//1.
		//System.out.println(uygulama.toString());
		
		//2.
		if (uygulama.equals(uygulama)) {
			System.out.println("her iki nesne aynidir.");
		}else {
			System.out.println("nesneler ayni degildir.");
		}
		
		//3.
		if (uygulama.equals(new Uygulama())) {
			System.out.println("her iki nesne aynidir");
		}else {
			System.out.println("nesneler ayni degildir.");
		}
		
		//4.
		Uygulama uyg = uygulama;
		
		if (uygulama.equals(uyg)) {
			System.out.println("her iki nesne aynidir");
		}else {
			System.out.println("nesneler ayni degildir.");
		}
		
		//5.
		System.out.println("5.");
		Test t1 = new Test(100);
		Test t2 = new Test(100);
		
		if (t1.equals(t2)) {
			System.out.println("her iki nesne aynidir");
		}else {
			System.out.println("nesneler ayni degildir.");
		}
	}

	@Override
	public String toString() {
		return "Ben uygulama sinifindan bir nesneyim.";
	}
	
}

class Test{
	
	private int i;
	
	public Test(int i) {
		this.i = i;
	}
	
	public int geti() {
		return i;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		
		return this.i == ((Test)obj).geti();
	}
}
