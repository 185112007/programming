package tr.edu.kocaeli.util;

public class Utility
{
    public static int checkNumbers(String num1, String num2)
    { // number is Decimal or Roman ? if numbers are decimal return 0, else return 1
	
	int n1 = RomanToNumber.romanToDecimal(num1);
	int n2 = RomanToNumber.romanToDecimal(num2);
	
	if (numberOrNot(num1) && numberOrNot(num2))
	{
	    return 0;
	}else if(n1 != -1 && n2 != -1)
	{
	    return 1;
	}else {
	    return 2;
	}
    }

    static boolean numberOrNot(String input)
    {
	try
	{
	    Integer.parseInt(input);
	} catch (NumberFormatException ex)
	{
	    return false;
	}
	return true;
    }
}
