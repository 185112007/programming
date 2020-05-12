package objects;

public class TestObject {

	public static void main(String[] args) {
		Object object = new Double(1.5);
		System.out.println(object.hashCode());
		System.out.println(object.toString());
		System.out.println(object.getClass());
	}

}
