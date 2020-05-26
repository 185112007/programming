package ua.rba.util;

import java.util.Date;

/**
 * Eto klass dlya pecati
 * 
 * @author gafur
 *
 */
public class Print {
	
	/**
	 * Test
	 * 
	 * @param args - parametry prilojeniya
	 */
	public static void main(String[] args) {
		p("привет мир!", "UTF-8");
	}
	
	/**
	 *  Print text with given code page
	 *  
	 * @param text - Text dlya pecati
	 * @param cp - Kodovaya stranica
	 */
	public static void p(String text, String cp) {
		try {
			System.out.write((text + " " + new Date()).getBytes(cp));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
