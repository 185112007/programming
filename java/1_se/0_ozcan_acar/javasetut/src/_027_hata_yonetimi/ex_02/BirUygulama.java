package _027_hata_yonetimi.ex_02;


public class BirUygulama {
	public static void main(String[] args) throws Exception {
		BirUygulama uygulama = new BirUygulama();
		
		
		uygulama.metot(null);//uygulama bu satirda son bulacak
		System.out.println("exit...");
	}

	public void metot(String isim) throws Exception{
		if(isim == null) {
			throw new Exception("Lutfen isim giriniz!");
		}
		System.out.println(isim);
	}
}
