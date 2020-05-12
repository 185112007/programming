package design_patterns.course._11_composite.source;

public class Wall implements GameObject
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
