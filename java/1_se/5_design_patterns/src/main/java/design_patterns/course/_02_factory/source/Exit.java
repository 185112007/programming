package design_patterns.course._02_factory.source;

public class Exit extends AbstractGameObject
{
    private GameObjectType type;

    public Exit(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
}
