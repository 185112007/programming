package com.gafurhayytbayev;

public class UcBoyutlu {

	public static void main(String[] args) {
		int sayi[][][] = new int[3][4][5]; 
		
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[i].length; j++) {
				for (int k = 0; k < sayi[i][j].length; k++) {
					sayi[i][j][k] = i + j + k; 
				}
			}
		}
		
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[i].length; j++) {
				
				for (int k = 0; k < sayi[i][j].length; k++) {
					System.out.print(sayi[i][j][k] + "\t"); 
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
