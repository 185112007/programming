package design_patterns.course._10_command.source;

/**
 * Asagiya gitmek için kullanılan komut.
 *
 */
public class AsagiyaGitKomutu implements Komut
{
    private OyunKarakteri karakter = null;

    public AsagiyaGitKomutu(final OyunKarakteri karakter)
    {
	this.karakter = karakter;
    }

    @Override
    public void execute()
    {
	karakter.asagiyaGit();
    }

}
