package _019_nesne_compozisyonu.arac;

public class Bisiklet extends Arac{

	@Override
	public void drive() {
		bisikleteBin();
		pedalCevir();
	}

	private void pedalCevir() {
		System.out.println("Bisiklete bindim...");
	}

	private void bisikleteBin() {
		System.out.println("Paedali veriyorum...");
	}

}
