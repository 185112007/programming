package _015_abstract_class.arac;

public abstract class Arac {
	protected String marka;
	protected String model;
	protected int uretimYili;
	
	public abstract void drive();
	
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
