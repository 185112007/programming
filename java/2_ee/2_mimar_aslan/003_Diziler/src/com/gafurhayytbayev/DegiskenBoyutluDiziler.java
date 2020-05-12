package com.gafurhayytbayev;

public class DegiskenBoyutluDiziler {

	public static void main(String[] args) {
		int sayilarIkiBoyutlu[][] = new int[3][];

		sayilarIkiBoyutlu[0] = new int[1];
		sayilarIkiBoyutlu[1] = new int[2];
		sayilarIkiBoyutlu[2] = new int[3];
		
		for (int i = 0; i < sayilarIkiBoyutlu.length; i++) {
			for (int j = 0; j < sayilarIkiBoyutlu[i].length; j++) {
				sayilarIkiBoyutlu[i][j] = i + j;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(" ");
			for (int j = 0; j < sayilarIkiBoyutlu[i].length; j++) {
				System.out.print(sayilarIkiBoyutlu[i][j] + " ");
			}
			System.out.println();
		}
	}

}
