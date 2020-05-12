package _018_anonim_siniflar.arac;

public class Araba extends Arac{
	
	private String renk;
	private Motor motor;
	
	public class Motor{
		int begirgucu;
		
		public int getBeygirGucu() {
			System.out.println("Arabanin rengi: " + renk);
			return begirgucu;
		}
		
		public void setBeygirGucu(int beygirgucu) {
			this.begirgucu = beygirgucu;
		}
	}
	
	public Araba() {
		super();
		motor = new Motor();
		motor.begirgucu = 120;
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

	public Motor getMotor() {
		return motor;
	}
	
}
