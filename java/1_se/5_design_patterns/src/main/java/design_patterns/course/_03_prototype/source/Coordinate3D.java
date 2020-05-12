package design_patterns.course._03_prototype.source;

public class Coordinate3D extends AbstractCoordinate
{

    private int z;
    
    public Coordinate3D(int x, int y, int z)
    {
	super(x, y);
	this.z = z;
    }
    
    public void setZ(int z)
    {
	this.z = z;
    }
    
    public int getZ()
    {
	return z;
    }
    
    @Override
    public PrototypeCapable shallowCopy() 
    {
	return this;
    }

    @Override
    public PrototypeCapable deepCopy()
    {
	Coordinate3D coor = this;
	return coor;
    }

}
