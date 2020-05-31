package ua.rba;

public class A1 {
	
	private String _name;
//	private String s = new String(""); 
	private StringBuffer s = new StringBuffer();
	private StringBuffer r;
	public A1() {
		super();
	}
	
	public A1(String name) {
		_name = name;
		for (int i = 0; i < 100; i++) {
//			s = new String(s + " " + i);
			r = new StringBuffer(" ");
			
			s.append(r.append(i));
			
		}
		System.out.println("object created, name = " + name);
	}
	
	@Override
	public String toString() {
		return _name + s;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed object _name="+_name);
	}
}
