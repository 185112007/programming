package design_patterns.course._03_prototype.source;

public abstract class AbstractCoordinate implements PrototypeCapable
{
    private int x;
    private int y;
    
    public AbstractCoordinate(int x, int y)
    {
	this.x = x;
	this.y = y;
    }
    
    public int getX()
    {
	return x;
    }
    public void setX(int x)
    {
	this.x = x;
    }
    public int getY()
    {
	return y;
    }
    public void setY(int y)
    {
	this.y = y;
    }
}
