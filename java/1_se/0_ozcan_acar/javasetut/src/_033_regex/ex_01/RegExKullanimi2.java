package _033_regex.ex_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExKullanimi2 {

	public static void main(String[] args) {
		//arama kalını sadece kucuk ve buyuk harflerden olusmaktadır
		//+ isaretini kulanarak birden fazla harf araıgımızı ifade ediyorus
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher("Istanbul1");
		boolean bool = matcher.matches();
		System.out.println(bool);
	}

}
