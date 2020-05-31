package ua.rba;

public class MyCustomException extends Throwable {
	
	private String msg;
	
	public MyCustomException(String message) {
		msg = message;
	}
	
	@Override
	public String getMessage() {
		return "Zavershaetsya prilojenie - pricina: " + msg;
	}
}
