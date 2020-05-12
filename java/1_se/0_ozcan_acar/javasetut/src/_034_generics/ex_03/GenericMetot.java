package _034_generics.ex_03;

public class GenericMetot {
	Object obj;
	
	<T> void set(T obj) {
		this.obj = obj;
	}
	
	Object get() {
		return obj;
	}
	
	public static void main(String[] args) {
		GenericMetot metot = new GenericMetot();
		metot.set("1");
		metot.set(1);
		metot.set(1.00);
	}
}
