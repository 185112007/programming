package tr.edu.kocaeli.exceptions;

public class InvalidRomanSymbolException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidRomanSymbolException(String errorMessage)
    {
	super(errorMessage);
    }
}
