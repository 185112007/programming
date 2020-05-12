package annotations;

public class Inherited extends Parent{
	
	@Override
	public void method1() {
		System.out.println("inherited");
		method2();
	}
	
	@Deprecated
	public void method2() {
		
	}
}
