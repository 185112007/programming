package design_patterns.course._11_composite.source;

import java.util.ArrayList;
import java.util.List;

public class Game implements GameObject
{

    private GameObjectType type;
    private List<GameObject> list = new ArrayList<>();

    public Game(GameObjectType type)
    {
	this.type = type;
    }

    public GameObjectType getType()
    {
	return type;
    }
    
    public void addComponent(final GameObject o)
    {
	list.add(o);
    }
    
    public void remComponent(final GameObject o)
    {
	if (list.contains(o))
	{
	    getComponentList().remove(o);
	}
    }

    public GameObject getComponent(int index)
    {
	GameObject o = null;
	try
	{
	    o = getComponentList().get(index);
	} catch (Exception e)
	{
	    System.out.println(index + " nolu obje bulunamadi!");
	}
	return o;
    }
    
    private List<GameObject> getComponentList()
    {
	return list;
    }
}
