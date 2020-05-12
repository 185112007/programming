package design_patterns.course._01_singleton.source;

public class Wall extends AbstractGameObject
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
