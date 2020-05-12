package _027_hata_yonetimi.ex_01;

public class BirUygulama {

	public static void main(String[] args) {
		BirUygulama uygulama = new BirUygulama();
		
		try {
			uygulama.metot(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("exit...");
	}

	public void metot(String isim) throws Exception{
		if(isim == null) {
			throw new Exception("Lutfen isim giriniz!");
		}
		System.out.println(isim);
	}
	
}
