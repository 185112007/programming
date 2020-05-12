package design_patterns.course._06_abstract_factory.source;

public class ConcreteFactory2 implements AbstractFactory
{

    @Override
    public StaticObject getStaticObject()
    {
	return new Nothing(GameObjectType.NOTHING);
    }

    @Override
    public MovingObject getMovingObject()
    {
	return new GoldMan(GameObjectType.GOLDMAN);
    }

}
