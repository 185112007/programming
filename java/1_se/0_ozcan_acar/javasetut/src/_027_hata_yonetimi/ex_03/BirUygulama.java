package _027_hata_yonetimi.ex_03;


public class BirUygulama {
	public static void main(String[] args) {
		BirUygulama uygulama = new BirUygulama();
		
		uygulama.metot(null);
		
		System.out.println("exit...");
	}

	public void metot(String isim){
		if(isim == null) {
			throw new RuntimeException("Lutfen isim giriniz!");
		}
		System.out.println(isim);
	}
}
