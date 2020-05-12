package _013_oop._003.arac;

public class Araba extends Arac{
	
	private String renk;
	
	public Araba() {
		super();
		
		this.marka = "Marka"; //protected oldugu icin alt siniflar gorebilir
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
