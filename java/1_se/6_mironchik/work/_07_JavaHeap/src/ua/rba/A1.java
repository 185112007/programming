package ua.rba;

public class A1 extends Object{
	
	public int counter;			// dynamically counter=0
	public static int counterStatic = 0;
	
	private static long idStatic;
	private long id;			// 4 byte memory
	
	public A1() {				// constructor
		System.out.println("3.-------constructor A1()---------");
		this.id = System.currentTimeMillis() + (long)(Math.random()*1000);
	}
	
	// getters & setters => encapsulation
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override					// annotation Override
	public String toString() {
		return "------Test class A1" + super.toString() + "-----------";
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("------Hash code-----");
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("-----equals-----");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A1 other = (A1) obj;
		if (id != other.id)
			return false;
		return true;
	}



	{
		System.out.println("2.-------block A1-------" + idStatic++);
	}
	
	static{
		System.out.println("1.-------static block A1-------" + idStatic++);
	}
}
