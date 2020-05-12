package design_patterns.course._10_command.source;

/**
 * Yukari gitmek için kullanılan komut.
 *
 */
public class YukariGitKomutu implements Komut
{
    private OyunKarakteri karakter = null;

    public YukariGitKomutu(final OyunKarakteri karakter)
    {
	this.karakter = karakter;
    }

    @Override
    public void execute()
    {
	karakter.yukariGit();
    }

}
