package com.gafurhayytbayev;

public class IkiboyutluDizilerdeDegerAtama {

	public static void main(String[] args) {
		double sayi[][] = { 
				{ 1299, 1071, 1963 }, 
				{ 5.82, 23.4, 34.7 }, 
				{ 2323.0, 232, 3 * 2 * 4 } };
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[i].length; j++) {
				System.out.print(sayi[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
