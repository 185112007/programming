package design_patterns.course._05_builder.source;

public class CoordinateBuilderImpl implements CoordinateBuilder
{

    private Coordinate coorTmp;
    
    public CoordinateBuilderImpl() {
	coorTmp = new Coordinate();
    }
    
    @Override
    public Coordinate build()
    {
	Coordinate coor = new Coordinate();
	coor.setX(coorTmp.getX());
	coor.setY(coorTmp.getY());
        return coor;
    }

    @Override
    public CoordinateBuilder setX(final int x)
    {
	coorTmp.setX(x);
        return this;
    }

    @Override
    public CoordinateBuilder setY(final int y)
    {
	coorTmp.setY(y);
        return this;
    }

}
