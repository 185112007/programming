package com.gafurhayytbayev;

public class BooleanTipi {

	public static void main(String[] args) {
		boolean booleanTipindekiDegisken;
		booleanTipindekiDegisken = true;
		
		if (booleanTipindekiDegisken) {
			System.out.println("1-Sonuc dogru");
		}

		System.out.println("booleanTipindekiDegisken: " + booleanTipindekiDegisken);

		booleanTipindekiDegisken = false;
		System.out.println("booleanTipindekiDegisken: " + booleanTipindekiDegisken);

		if (booleanTipindekiDegisken) {
			System.out.println("2-Sonuc dogru");
		}
		
	}

}
