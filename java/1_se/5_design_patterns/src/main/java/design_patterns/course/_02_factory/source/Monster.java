package design_patterns.course._02_factory.source;

public class Monster extends AbstractGameObject
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
