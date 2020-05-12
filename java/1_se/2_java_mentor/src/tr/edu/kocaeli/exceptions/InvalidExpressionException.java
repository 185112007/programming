package tr.edu.kocaeli.exceptions;

public class InvalidExpressionException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidExpressionException(String errorMessage)
    {
	super(errorMessage);
    }
}
