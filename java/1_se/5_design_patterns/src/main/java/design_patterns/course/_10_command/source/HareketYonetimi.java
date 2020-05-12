package design_patterns.course._10_command.source;

/**
 * Bir karakter yonetimi
 *
 */
public class HareketYonetimi
{
    public Komut[] komutlar = new Komut[4];

    public HareketYonetimi()
    {
	final OyunKarakteri obj = new OyunKarakteri();
	komutlar[0] = new SagaGitKomutu(obj);
	komutlar[1] = new SolaGitKomutu(obj);
	komutlar[2] = new YukariGitKomutu(obj);
	komutlar[3] = new AsagiyaGitKomutu(obj);
    }

    public void tikla(final int i)
    {
	if (i > komutlar.length || i < 0)
	{
	    throw new RuntimeException("" + "Tus gecersiz!");
	}
	komutlar[i].execute();
    }
}
