package ua.rba;

public class A3 {
	
	public long id1;			// dynamic variable
	private static long id2;	// static variable, id2=0 automatically
	
	public static int m1(int a, int b) {
		return a + b;
	}
	
	{
		System.out.println("-------will not appear-------");
	}
	
	/**
	 * we use static block for init static variables
	 */
	static {// id1 is dynamic & not accessible from static block
		id2 = System.currentTimeMillis();	// current time in ms
		System.out.println("-------static block--------id2=" + id2);
	}
}
