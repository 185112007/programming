package com.yazilimvideo;

public class _03_SelamlamaSinifi {
	private String isim;
	private String soyisim;
	private String mesaj;
	
	public _03_SelamlamaSinifi() { // parametre olursa javabean olmaz!!!
		super();
		this.mesaj = "Mesaj yok.";
		this.isim = "İsim yok.";
		this.soyisim = "Soyisim yok.";
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
}
