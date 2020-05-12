package com.gafurhayytbayev;

public class TekBoyutluDiziler {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int sayi1, sayi2, sayi3, a, c, b; //ayni tipte pespese tanimlayabiliris
		
		int ocak=1, subat=2, mart=3, nissan=4; //seklinde her ayi tanimlayabiliris
		
		int aylarDizisi[]; // suanda degeri null dir
		aylarDizisi = new int[12]; //bellekten yer ayirmak
		
		aylarDizisi[0] = 31;
		aylarDizisi[1] = 28;
		aylarDizisi[2] = 31;
		aylarDizisi[3] = 30;
		aylarDizisi[4] = 31;
		aylarDizisi[5] = 30;
		aylarDizisi[6] = 31;
		aylarDizisi[7] = 30;
		aylarDizisi[8] = 31;
		aylarDizisi[9] = 30;
		aylarDizisi[10] = 31;
		aylarDizisi[11] = 30;
		
		System.out.println("Ocak Ayi: " + aylarDizisi[0]);
		System.out.println("Subat Ayi: " + aylarDizisi[1]);
		System.out.println("Aralik Ayi: " + aylarDizisi[11]);
		
		int sayilar[] = {1299, 1071, 1923, 1453};// tanimlama ve atama
		
		System.out.println(sayilar[0]);
	}

}
