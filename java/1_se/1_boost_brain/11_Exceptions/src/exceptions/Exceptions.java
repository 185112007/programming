package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		Example example = new Example();
		
		// 2. mojno i tak
		try {
			example.method2();
			example.method1();
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		} catch(NewException e) {
			System.out.println(e.toString());
		}
		
		
	}

}
