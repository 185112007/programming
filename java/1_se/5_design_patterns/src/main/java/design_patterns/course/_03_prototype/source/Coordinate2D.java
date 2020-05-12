package design_patterns.course._03_prototype.source;

public class Coordinate2D extends AbstractCoordinate
{
    public TestClass t;
    public Coordinate2D(int x, int y)
    {
	super(x, y);
	t = new TestClass();
    }

    @Override
    public PrototypeCapable shallowCopy()
    {
	return this;
    }

    @Override
    public PrototypeCapable deepCopy()
    {
	return (PrototypeCapable) new Coordinate2D(this.getX(), this.getY());
    }
   
}
