package _019_nesne_compozisyonu.arac;

public class Araba extends Arac{
	
	private String renk;
	private Motor motor;//baska bir siniftan bir degiskenine sahiptir, compozisyon
	
	
	public Araba() {
		super();
		motor = new Motor(120);
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

	public int getBeygirGucu() {
		return motor.getBeygirgucu();
	}
	
}
