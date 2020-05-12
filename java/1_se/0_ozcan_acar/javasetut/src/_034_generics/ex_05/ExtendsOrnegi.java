package _034_generics.ex_05;

public class ExtendsOrnegi {

	public static class MyApp<T extends Number>{
		T number;
		
		T getNumber() {
			return number;
		}
		
		void setNumber(T x) {
			this.number = x;
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyApp<Integer> app = new MyApp<Integer>();
		
		//MyApp<String> app2 = new MyApp<String>();
	}

}
