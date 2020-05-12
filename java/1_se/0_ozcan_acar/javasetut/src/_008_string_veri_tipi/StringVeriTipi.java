package _008_string_veri_tipi;

public class StringVeriTipi {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String merhabaDunya= "Merhaba Dunya";
		
		String isim  = "Gafur";
		String soyad = "Hayytbayev";
		String musteri = isim + " " + soyad;
		
		System.out.println(musteri);
		System.out.println(musteri.length());
		System.out.println(musteri.substring(0, 5));
	}

}
