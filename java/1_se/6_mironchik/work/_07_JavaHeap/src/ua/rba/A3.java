package ua.rba;

public class A3 extends A2{
	
	public A3(String text) {
		super(text);
		System.out.println("3--------constructor A3----------");
	}
	
	@Override
	public String toString() {
		return "hash=" + hashCode() +"; ------Class A3, id=" + getId() + "; " + super.toString() + "------";
	}
	
	{
		System.out.println("2.-------block A3-------");
	}
	
	static{
		System.out.println("1.-------static block A3-------");
	}
}
