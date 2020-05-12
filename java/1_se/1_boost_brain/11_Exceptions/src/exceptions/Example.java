package exceptions;

public class Example {
	
	public void method1() throws CustomException{
		throw new CustomException("custom");
	}
	
	public void method2() throws NewException{
		throw new NewException();
	}
}
