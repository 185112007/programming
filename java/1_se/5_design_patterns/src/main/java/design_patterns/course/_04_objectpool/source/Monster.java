package design_patterns.course._04_objectpool.source;

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
