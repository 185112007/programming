package _028_autoboxing_autounboxing.ex_01;

public class AutoboxingUygulama {

	public static void main(String[] args) {
		int i = 100;
		birfonksyon(i);
		
		int x = yeniBirFonksyon();
		System.out.println(x);
	}

	private static void birfonksyon(Integer i) {
		System.out.println(i.intValue());
	}
	
	private static int yeniBirFonksyon() {
		Integer integer = new Integer(5);
		return integer;
	}

}
