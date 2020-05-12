package _011_switch;

public class SwitchKomutu {

	public static void main(String[] args) {
		// 1.if-else
		char ch = 'X';
		
		if (ch == 'A') {
			System.out.println("A harfini buldum");
		}
		else if(ch == 'B') {
			System.out.println("B harfini buldum");
		}
		else if (ch == 'C') {
			System.out.println("C harfini buldum");
		}
		else {
			System.out.println("Harfi taniyamadim.");
		}
		
		//2. switch
		ch = 'A';
		switch (ch) {
		case 'A':
			System.out.println("A harfini buldum");
			break;
		case 'B':
			System.out.println("B harfini buldum");
			break;
		case 'C':
			System.out.println("C harfini buldum");
			break;
		default:
			System.out.println("Harfi taniyamadim");
			break;
		}
		
		//3.
		int i = 100;
		switch (i) {
		case 100:
			System.out.println("100 rakamini buldum.");
			break;
		case 200:
			System.out.println("200 rakamini buldum");
			break;
		default:
			System.out.println("Rakami taniyamadim");
			break;
		}
	}

}
