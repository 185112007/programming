package ua.rba;

public class A2 extends A1 {
	
	private String name;
	
	public A2() {
		System.out.println("3.------constructor A2------");
	}
	
	public A2(String name) {
		this.name = name;
		System.out.println("4.-------constructor A2(text)------");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "------Class A2 " + super.toString() + "------";
	}
	
	{
		System.out.println("2.-------block A2-------");
	}
	
	static{
		System.out.println("1.-------static block A2-------");
	}
}
