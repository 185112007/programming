package design_patterns.course._01_singleton.source;

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
