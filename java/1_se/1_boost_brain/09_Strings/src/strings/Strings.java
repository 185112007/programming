package strings;

public class Strings {

	public static void main(String[] args) {
		String string = "Hello world!";
		
		// 1. string length
		System.out.println("1. string length");
		System.out.println(string.length());
		
		// 2. concatination
		System.out.println("\n2. concatination");
		String string2 = string + " World hello";
		System.out.println(string2);
		
		// 3. replace operator
		System.out.println("\n3. replace operator");
		String string3 = string2.replace('o', 'u');
		System.out.println(string3);
		
		// 4. substring(start index, end index)
		System.out.println("\n4. substring(start index, end index)");
		String substring = string3.substring(0, 5);
		System.out.println(substring);
		
		// 5. split operator
		System.out.println("\n5. split operator");
		String split[] = string3.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
