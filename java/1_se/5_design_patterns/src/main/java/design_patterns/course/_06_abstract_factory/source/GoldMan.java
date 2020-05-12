package design_patterns.course._06_abstract_factory.source;

public class GoldMan implements MovingObject
{
    private GameObjectType type;

    public GoldMan(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
}
