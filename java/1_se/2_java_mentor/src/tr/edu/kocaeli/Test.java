package tr.edu.kocaeli;

import java.util.Scanner;

import tr.edu.kocaeli.exceptions.InvalidExpressionException;
import tr.edu.kocaeli.exceptions.InvalidRomanSymbolException;
import tr.edu.kocaeli.util.NumberToRoman;
import tr.edu.kocaeli.util.RomanToNumber;
import tr.edu.kocaeli.util.Utility;

public class Test
{

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InvalidExpressionException, InvalidRomanSymbolException
    {
	Scanner scan = new Scanner(System.in);

	Calculator calc = new Calculator();

	String[] expression;
	String reg = " ";

	while (true)
	{
	    System.out.println("Input:");
	    expression = scan.nextLine().split(reg);
	    if (expression.length < 3)
		throw new InvalidExpressionException("there are no spaces");
	    else
	    {
		generateOutput(calc, expression);
	    }
	}
    }

    private static void generateOutput(Calculator calc, String[] expression) throws InvalidRomanSymbolException
    {
	int num1;
	int num2;
	int result;
	String op, resultStr;
	
	int res = Utility.checkNumbers(expression[0], expression[2]);
	if (res == 0) // decimal numbers
	{
	    num1 = Integer.parseInt(expression[0]);
	    op = expression[1];
	    num2 = Integer.parseInt(expression[2]);
	    result = calc.calculate(num1, num2, op);
	    resultStr = String.valueOf(result);
	} else if(res == 1) // roman numbers
	{
	    num1 = RomanToNumber.romanToDecimal(expression[0]);
	    op = expression[1];
	    num2 = RomanToNumber.romanToDecimal(expression[2]);
	    result = calc.calculate(num1, num2, op);
	    resultStr = NumberToRoman.toRoman(result);
	} else
	{
	    throw new InvalidRomanSymbolException("invalid number types");
	}
	
	System.out.println("Output:");
	System.out.println(resultStr);
	System.out.println();
    }

}
