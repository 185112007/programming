package _032_dil_dosyalari.ex_01;

import java.util.Locale;
import java.util.ResourceBundle;

public class DilDosyalari {

	public static void main(String[] args) {
		
		ResourceBundle bundleTR = 
				ResourceBundle.getBundle(
						"_032_dil_dosyalari/ex_01/dil", 
						new Locale("tr_TR"));
		System.out.println(bundleTR.getString("ornek_anahtar"));
		
		ResourceBundle bundleDE = 
				ResourceBundle.getBundle(
						"_032_dil_dosyalari/ex_01/dil", 
						new Locale("de_DE"));
		System.out.println(bundleDE.getString("ornek_anahtar"));
		
		ResourceBundle bundleEN = 
				ResourceBundle.getBundle(
						"_032_dil_dosyalari/ex_01/dil", 
						new Locale("en_EN"));
		System.out.println(bundleEN.getString("ornek_anahtar"));
		
		ResourceBundle bundle = 
				ResourceBundle.getBundle(
						"_032_dil_dosyalari/ex_01/dil", 
						new Locale(System.getProperty("dil")));
		System.out.println(bundle.getString("ornek_anahtar"));
	}

}
