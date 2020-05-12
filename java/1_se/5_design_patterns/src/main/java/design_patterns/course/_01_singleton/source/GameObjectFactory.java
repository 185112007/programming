package design_patterns.course._01_singleton.source;

public class GameObjectFactory
{
    public static AbstractGameObject createObject(GameObjectType type)
    {
	AbstractGameObject obj = null;

	switch (type)
	{
	case NOTHING:
	{
	    obj = new Nothing(type);
	    break;
	}
	case WALL:
	{
	    obj = new Wall(type);
	    break;
	}
	case MONSTER:
	{
	    obj = new Monster(type);
	    break;
	}
	case TREASURE:
	{
	    obj = new Treasure(type);
	    break;
	}
	case EXIT:
	{
	    obj = new Exit(type);
	    break;
	}
	case GOLDMAN:
	{
	    obj = new GoldMan(type);
	    break;
	}
	default:
	    throw new IllegalArgumentException("Can't create object type: " + type);

	}

	return obj;
    }
}
