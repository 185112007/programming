package _004_fonksyonlar;

public class Fonksyonlar_2 {

	// paket icinde herkese acık, default package
	static void merhabaDunya() {
		System.out.println("Merhaba Dunya");
	}

	// özel fonksyonolarak işaretlenmiş durumda, sadece bu sınıfta kullanılır
	private static void privateMerhabaDunya() {
		System.out.println("Merhaba Dunya");
	}

	// herkese acık
	public static void publicMerhabaDunya() {
		System.out.println("Merhaba Dunya");
	}

	static void fonksyonum() {
		privateMerhabaDunya();
	}
}
