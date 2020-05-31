package ua.rba;

public class B2 {
	public long id1;			// dynamic variable
	private static long id2;	// static variable, id2=0 automatically
	
	public static int m1(int a, int b) {
		return a + b;
	}
	
	public static int m2(int a, int b){
		System.out.println("-----call private inner class. ---" + B22.info());
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
	
	public static class B21{	// inner class may be a static
		public static String info() {
			return "" + id2;
		}
		
		static {
			System.out.println("------B21 loaded-------");
		}
	}
	
	private static class B22{	// private inner class may be a static
		public static String info() {
			return "" + id2;
		}
		
		static {
			System.out.println("------B22 loaded-------");
		}
	}
}
