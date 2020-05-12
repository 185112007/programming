package _030_yardimci_siniflar.ex_02;

public class StringBuilderSinifi {

	public static void main(String[] args) {
		
		final StringBuilder isimVeSoyad = new StringBuilder();
		isimVeSoyad.append("Ahmet");
		isimVeSoyad.append(" ");
		isimVeSoyad.append("Yildirim");
		
		System.out.println(isimVeSoyad.toString());
	}

}
