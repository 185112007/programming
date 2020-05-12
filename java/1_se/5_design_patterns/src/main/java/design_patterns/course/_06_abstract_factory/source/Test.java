package design_patterns.course._06_abstract_factory.source;

public class Test
{

    public static void main(String[] args)
    {
	// Factory Impl 1
	System.out.println("Concrete impl 1");
	AbstractFactory factory = new ConcreteFactory1();
	StaticObject staticObj = factory.getStaticObject();
	MovingObject movingObj = factory.getMovingObject();
	System.out.println(staticObj.getType());
	System.out.println(movingObj.getType());

	//Factory Impl 2
	System.out.println("Concrete impl 2");
	factory = new ConcreteFactory2();
	staticObj = factory.getStaticObject();
	movingObj = factory.getMovingObject();
	System.out.println(staticObj.getType());
	System.out.println(movingObj.getType());
    }

}
