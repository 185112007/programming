package _019_nesne_compozisyonu.arac;

public abstract class Arac implements AracInterface{
	protected String marka;
	protected String model;
	protected int uretimYili;
	
	public Arac() {
		
	}
	
	public Arac(String marka, String model, int uretimYili) {
		this.marka = marka;
		this.model = model;
		this.uretimYili = uretimYili;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getUretimYili() {
		return uretimYili;
	}
	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}
	
	
}
