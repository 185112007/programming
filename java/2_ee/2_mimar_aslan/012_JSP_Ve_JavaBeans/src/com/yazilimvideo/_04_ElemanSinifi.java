package com.yazilimvideo;

import java.util.Hashtable;

public class _04_ElemanSinifi {
	private String adi;
	private String soyadi;
	private String email;
	private String kullaniciadi;
	private String cinsiyet;
	private String parola1;
	private String parola2;
	private String postakodu;
	private String adres;
	private String[] tecrubealani;
	private Hashtable<String, String> hatalar;
	
	
	
	public _04_ElemanSinifi() {
		super();
		this.adi = "";
		this.soyadi = "";
		this.email = "";
		this.kullaniciadi = "";
		this.cinsiyet = "";
		this.parola1 = "";
		this.parola2 = "";
		this.postakodu = "";
		this.adres = "";
		this.tecrubealani = new String[] {"1"};
		this.hatalar = new Hashtable<String, String>();
	}

	public boolean kontrolFonksiyonu() {
		boolean hatadurumu = true;
		if (adi.equals("")) {
			hatalar.put("adi", "Lütfen adınızı giriniz.");
			adi="";
			hatadurumu = false;
		}
		if (soyadi.equals("")) {
			hatalar.put("soyadi", "Lütfen soyadınızı giriniz.");
			soyadi="";
			hatadurumu = false;
		}
		if (email.equals("") || (email.indexOf('@') == -1)) {
			hatalar.put("email", "Lütfen emailinizi giriniz.");
			email="";
			hatadurumu = false;
		}
		if (kullaniciadi.equals("")) {
			hatalar.put("kullaniciadi", "Lütfen kullanıcı adınızı giriniz.");
			kullaniciadi="";
			hatadurumu = false;
		}
		if (adres.equals("")) {
			hatalar.put("adres", "Lütfen adresinizi giriniz.");
			adres="";
			hatadurumu = false;
		}
		if (parola1.equals("")) {
			hatalar.put("parola1", "Lütfen parolanızı giriniz.");
			parola1="";
			hatadurumu = false;
		}
		if (!parola1.equals("") && (parola2.equals("") || !parola1.equals(parola2))) {
			hatalar.put("parola2", "Lütfen iki parolanızı aynı giriniz.");
			parola2="";
			hatadurumu = false;
		}
		if (postakodu.equals("")) {
			hatalar.put("postakodu", "Lütfen posta kodunu giriniz.");
			adres="";
			hatadurumu = false;
		}else {
			try {
				Integer.parseInt(postakodu);
			} catch (Exception e) {
				hatalar.put("postakodu", "Lütfen sadece sayı giriniz.");
				postakodu="";
				hatadurumu=false;
			}
		}
		return hatadurumu;
	}
	
	public String secilenTecrubeler(String s) {
		String result = "";
		if (tecrubealani.length >0) {
			for (int i = 0; i < tecrubealani.length; i++) {
				if (tecrubealani[i].equals(s)) {
					result = "checked";
					break;
				}
			}
		}
		return result;
	}
	
	public String secilenCinsiyet(String s) {
		return (cinsiyet.equals(s) ? "checked":"");
	}
	
	public String getHataMesajlari(String hataCumleleri) {
		String hataMesajlari = (String)hatalar.get(hataCumleleri.trim());
		return (hataMesajlari == null) ? "":hataMesajlari;
	}

	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKullaniciadi() {
		return kullaniciadi;
	}
	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getParola1() {
		return parola1;
	}
	public void setParola1(String parola1) {
		this.parola1 = parola1;
	}
	public String getParola2() {
		return parola2;
	}
	public void setParola2(String parola2) {
		this.parola2 = parola2;
	}
	public String getPostakodu() {
		return postakodu;
	}
	public void setPostakodu(String postakodu) {
		this.postakodu = postakodu;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String[] getTecrubealani() {
		return tecrubealani;
	}
	public void setTecrubealani(String[] tecrubealani) {
		this.tecrubealani = tecrubealani;
	}
	public Hashtable<String, String> getHatalar() {
		return hatalar;
	}
	public void setHatalar(Hashtable<String, String> hatalar) {
		this.hatalar = hatalar;
	}
}
