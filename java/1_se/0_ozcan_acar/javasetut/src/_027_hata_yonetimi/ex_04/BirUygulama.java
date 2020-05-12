package _027_hata_yonetimi.ex_04;

public class BirUygulama {
	public static void main(String[] args) {
		BirUygulama uygulama = new BirUygulama();
		
		try {
			uygulama.metot(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("exit1...");
		
		uygulama.metot2("");
		
		System.out.println("exit2...");
	}
	
	public void metot(String isim) throws Exception{
		if(isim == null){
			throw new IstisnaSinifim("Lutfen isim giriniz!");
		}
		System.out.println(isim);
	}
	
	public void metot2(String isim) {
		if(isim.isEmpty()){
			throw new IstisnaSinifim2("Lutfen isim giriniz!");
		}
		System.out.println(isim);
	}
}
