package generics;

public class Main {

	public static void main(String[] args) {
		
		CustomArrayList<String> strings = new CustomArrayList<>();
		
		for(int i=0; i<100; i++) {
			strings.add("Hello world " + i);
		}
		
		for(int i=0; i<strings.getLength(); i++) {
			System.out.println(strings.get(i));
		}
		
		function(42);
		function("hello world");
		function(4.8);
		
		
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		
	}

	private static <T> void function(T parameter) {
		System.out.println(parameter.toString());
	}

}
