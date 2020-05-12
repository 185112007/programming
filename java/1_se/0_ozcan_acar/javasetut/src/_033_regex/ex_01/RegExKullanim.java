package _033_regex.ex_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExKullanim {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//d-digit, rakam aramakistedigimizi ifade ettik,
		//{5}-posta kodunun 6 rakamdan olustugunu ifade etmektedir
		Pattern pattern = Pattern.compile("\\d{6}");
		//yukaridaki ile aynı anlam tasimaktadir
		Pattern pattern2 = Pattern.compile("[0-9]{6}");
		
		Matcher matcher = pattern2.matcher("345623");
		boolean bool = matcher.matches();
		System.out.println(bool);
		
		
	}

}
