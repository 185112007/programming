package com.yazilimvideo;

import com.yazilimvideo.api.User;

public class _02_Kullanici implements User{
	String kullaniciadimiz;
	String parolamiz;

	public String getKullaniciadimiz() {
		return kullaniciadimiz;
	}

	public void setKullaniciadimiz(String kullaniciadimiz) {
		this.kullaniciadimiz = kullaniciadimiz;
	}

	public String getParolamiz() {
		return parolamiz;
	}

	public void setParolamiz(String parolamiz) {
		this.parolamiz = parolamiz;
	}
}
