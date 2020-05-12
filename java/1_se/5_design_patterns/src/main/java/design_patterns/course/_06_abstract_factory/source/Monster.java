package design_patterns.course._06_abstract_factory.source;

public class Monster implements MovingObject
{
    private GameObjectType type;

    public Monster(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }

}
