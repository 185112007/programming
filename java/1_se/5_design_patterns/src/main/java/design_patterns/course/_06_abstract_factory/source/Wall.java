package design_patterns.course._06_abstract_factory.source;

public class Wall implements StaticObject
{
    private GameObjectType type;

    public Wall(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
}
