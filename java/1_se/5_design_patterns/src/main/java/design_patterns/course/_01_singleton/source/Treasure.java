package design_patterns.course._01_singleton.source;

public class Treasure extends AbstractGameObject
{
    private GameObjectType type;

    public Treasure(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }

}
