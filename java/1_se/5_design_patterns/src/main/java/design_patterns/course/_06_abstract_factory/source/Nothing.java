package design_patterns.course._06_abstract_factory.source;

public class Nothing implements StaticObject
{
    private GameObjectType type;

    public Nothing(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }

}
