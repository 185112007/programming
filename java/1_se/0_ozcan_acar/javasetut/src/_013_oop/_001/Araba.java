package _013_oop._001;

public class Araba extends Arac{
	
	private String renk;
	
	public Araba(String marka, String model, int uretimYili, String renk) {
		super(marka, model, uretimYili);
		this.renk = renk;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
