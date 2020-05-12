package design_patterns.course._03_prototype.source;

public class TestPrototypePattern
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
	System.out.println("Shallow Copy:");
	
	Coordinate2D t1 = new Coordinate2D(0, 0);
	Coordinate2D t2 = (Coordinate2D)t1.shallowCopy();
	
	System.out.println(t1.getX());
	System.out.println(t2.getX());
	
	t1.setX(10);
	t1.t.setA(200);
	
	System.out.println("t1.getX(): "+t1.getX());
	System.out.println("t2.getX(): "+t2.getX());
	
	System.out.println("t1.t.getA(): "+t1.t.getA());
	System.out.println("t2.t.getA(): "+t2.t.getA());
	
	System.out.println(t1.toString());
	System.out.println(t2.toString());
	
	System.out.println("\nDeep Copy:");
	
	Coordinate2D tt1 = new Coordinate2D(0, 0);
	Coordinate2D tt2 = (Coordinate2D)tt1.deepCopy();
	
	System.out.println("tt1.getX(): "+tt1.getX());
	System.out.println("tt2.getX(): "+tt2.getX());
	
	tt1.setX(10);
	tt1.t.setA(300);
	
	System.out.println(tt1.getX());
	System.out.println(tt2.getX());
	
	System.out.println("tt1.t.getA(): "+tt1.t.getA());
	System.out.println("tt2.t.getA(): "+tt2.t.getA());
	
	System.out.println(tt1.toString());
	System.out.println(tt2.toString());
    }

}
