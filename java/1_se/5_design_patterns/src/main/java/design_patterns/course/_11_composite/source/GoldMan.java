package design_patterns.course._11_composite.source;

public class GoldMan implements GameObject
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
