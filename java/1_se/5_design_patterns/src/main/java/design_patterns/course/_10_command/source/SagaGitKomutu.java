package design_patterns.course._10_command.source;

/**
 * Karakteri saga hareket ettirmek için kullanılan komut.
 *
 */
public class SagaGitKomutu implements Komut
{
    private OyunKarakteri karakter = null;

    public SagaGitKomutu(final OyunKarakteri karakter)
    {
	this.karakter = karakter;
    }

    @Override
    public void execute()
    {
	karakter.sagaGit();
    }

}
