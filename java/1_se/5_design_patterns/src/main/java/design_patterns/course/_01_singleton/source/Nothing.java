package design_patterns.course._01_singleton.source;

public class Nothing extends AbstractGameObject
{
    private GameObjectType type;

    public Nothing(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }

}
