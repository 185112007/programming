package design_patterns.course._09_memento.source;

public class Memento
{
    private Object[] elements;

    public Memento(final Object[] elem)
    {
	elements = elem;
    }

    public Object[] getElements()
    {
	return elements;
    }

    public void setElements(final Object[] elements)
    {
	this.elements = elements;
    }
}
