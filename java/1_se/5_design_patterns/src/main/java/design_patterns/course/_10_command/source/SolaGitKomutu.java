package design_patterns.course._10_command.source;

/**
 * Sola gitmek için kullanılan komut.
 *
 */
public class SolaGitKomutu implements Komut
{
    private OyunKarakteri karakter = null;

    public SolaGitKomutu(final OyunKarakteri karakter)
    {
	this.karakter = karakter;
    }

    @Override
    public void execute()
    {
	karakter.solaGit();
    }

}
