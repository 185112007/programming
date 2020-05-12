package tr.edu.kocaeli;

public class Calculator
{
    public void whoAreYou()
    {
	System.out.println("I'm a Calculator :)");
    }

    int calculate(int x, int y, String op)
    {
	switch (op)
	{
	case "+":
	    return x + y;
	case "-":
	    return x - y;
	case "*":
	    return x * y;
	case "/":
	    return x / y;
	default:
	    throw new AssertionError("Unknown operation " + this);
	}
    }
}
