package com.yazilimvideo;

import javax.servlet.http.HttpServletRequest;

import com.yazilimvideo.api.User;

public class _02_GirilenDegerleriKontrolEdenSinif {
	
	public void hatalariKontrolEdenMethod(HttpServletRequest request, User user) {
		String hatalar = "";
		
		if (user.getKullaniciadimiz() == null || user.getKullaniciadimiz().trim().length() == 0) {
			hatalar = hatalar + "<li>KULLANICI ADI EKSİK<br>";
		}
		
		if (user.getParolamiz() == null || user.getParolamiz().trim().length() == 0) {
			hatalar = hatalar + "<li>PAROLA EKSİK<br>";
		}
		
		if (hatalar.trim().length() > 0) {
			request.setAttribute("hatalar", hatalar);
		}
	}
}
