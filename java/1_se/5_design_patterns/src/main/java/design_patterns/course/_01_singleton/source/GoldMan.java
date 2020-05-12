package design_patterns.course._01_singleton.source;

public class GoldMan extends AbstractGameObject
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
