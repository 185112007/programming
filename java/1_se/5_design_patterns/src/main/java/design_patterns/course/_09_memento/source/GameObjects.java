package design_patterns.course._09_memento.source;

import java.util.ArrayList;

import design_patterns.course._09_memento.source.abstracts.AbstractGameObject;

public class GameObjects
{
    /**
     * Bir oyun içinde yer alan objeleri allObjects isminde ArrayList içinde
     * tutuyoruz.
     */
    private ArrayList<AbstractGameObject> allObjects = new ArrayList<>();

    public void addObject(final int index, final AbstractGameObject obj)
    {
	getObjects().add(index, obj);
    }

    public void removeObject(final int index)
    {
	getObjects().remove(index);
    }

    public Memento createMemento()
    {
	return new Memento(getObjects().toArray());
    }

    public void setMemento(final Memento memento)
    {
	getObjects().clear();

	final Object[] tempObjeler = memento.getElements();
	for (int i = 0; i < tempObjeler.length; i++)
	{
	    final AbstractGameObject obj = (AbstractGameObject) tempObjeler[i];
	    getObjects().add(obj);
	}
    }

    public ArrayList<AbstractGameObject> getObjects()
    {
	return allObjects;
    }

    public void setObjects(final ArrayList<AbstractGameObject> objcts)
    {
	this.allObjects = objcts;
    }

    @Override
    public String toString()
    {
	final StringBuilder temp = new StringBuilder();
	for (int i = 0; i < getObjects().size(); i++)
	{
	    temp.append(getObjects().get(i).getType()).append(" \n");
	}
	return temp.toString();
    }
}
