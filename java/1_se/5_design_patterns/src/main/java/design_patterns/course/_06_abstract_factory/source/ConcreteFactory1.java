package design_patterns.course._06_abstract_factory.source;

public class ConcreteFactory1 implements AbstractFactory
{

    @Override
    public StaticObject getStaticObject()
    {
	return new Wall(GameObjectType.WALL);
    }

    @Override
    public MovingObject getMovingObject()
    {
	return new Monster(GameObjectType.MONSTER);
    }

}
