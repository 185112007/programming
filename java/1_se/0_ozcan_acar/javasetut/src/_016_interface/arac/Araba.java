package _016_interface.arac;

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

	@Override
	public void drive() {
		
		depoyuDoldur();
		motoruCalistir();
		vitesAt(1);
		vitesAt(2);
		vitesAt(3);
		vitesAt(4);
		
	}

	private void vitesAt(int i) {
		System.out.println("vitesi atiyorum..." + i);
	}

	private void motoruCalistir() {
		System.out.println("motoru calistiryorum");
	}

	private void depoyuDoldur() {
		System.out.println("depoyu dolduruyorum...");
	}

}
