package design_patterns.course._11_composite.source;

public class Monster implements GameObject
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
