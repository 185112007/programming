package _012_diziler;

public class Diziler {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int i1 = 100;
		int i2 = 100;
		int i3 = 100;
		int i4 = 100;
		int i5 = 100;
		
		int[] i = new int[5];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		i[4] = 500;
		
//		___0_____1_____2_____3_____4__
//		| 100 | 200 | 300 | 400 | 500 |
//		|_____|_____|_____|_____|_____|
		
		System.out.println(i[3]); //print 400
		System.out.println(i.length);
		
		int[]  ii = {10,20,30,40,50};
		int x = ii[0];
		System.out.println(x);
		
		String[] isimler = new String[2];
		isimler[0] = new String("Gafur");
		isimler[1]  = "Hayytbayev";
		System.out.println(isimler[0] + " " + isimler[1]);
		
		for (int j = 0; j < isimler.length; j++) {
			System.out.println(isimler[j]);
		}
		
		int index = 0;
		
		while (index < isimler.length) {
			System.out.println(isimler[index]);
			index++;
		}
		
	}

}
