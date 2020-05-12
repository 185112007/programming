package _014_oop_method_overriding._001.arac;

public class Araba extends Arac{
	
	private String renk;
	
	public Araba() {
		super();
		
	}

	@Override
	public String getMarka() {
		System.out.println("araba.getMarka() enter...");
		return super.getMarka();
	}
	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
