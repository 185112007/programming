package com.gafurhayytbayev;

public class IkiBoyutluDiziler {

	public static void main(String[] args) {
		int sayilarIkiBoyutlu[][] = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sayilarIkiBoyutlu[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(" ");
			for (int j = 0; j < 4; j++) {
				System.out.print(sayilarIkiBoyutlu[i][j] + " ");
			}
			System.out.println();
		}
	}

}
