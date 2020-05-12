package design_patterns.course._10_command.source;

/**
 * Test programı
 *
 */
public class Client
{

    public static void main(String[] args)
    {
	// Hareket yonetim panelini oluşturur
	final HareketYonetimi yonetimPaneli = new HareketYonetimi();
	// sıfır nolu tusa basar
	yonetimPaneli.tikla(0); // karakter saga yurur
	// bir nolu tusa basar
	yonetimPaneli.tikla(1); // karakter sola yurur
	// iki nolu tusa basar
	yonetimPaneli.tikla(2); // karakter yukari yurur
	// uc nolu tusa basar
	yonetimPaneli.tikla(3); // karakter asagiya yurur
    }

}
