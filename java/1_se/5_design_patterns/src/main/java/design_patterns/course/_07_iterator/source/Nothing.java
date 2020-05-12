package design_patterns.course._07_iterator.source;

public class Nothing extends AbstractGameObject
{
    private GameObjectType type;
    private int[] pixelColor = new int[5];

    public Nothing(GameObjectType type)
    {
	this.type = type;
	pixelColor[0] = 255;
	pixelColor[1] = 254;
	pixelColor[2] = 253;
	pixelColor[3] = 252;
	pixelColor[4] = 251;
    }

    public GameObjectType getType()
    {
	return type;
    }
    
    public int[] getAllPixelColor()
    {
	return pixelColor;
    }

    @Override
    public Iterator getIterator()
    {
	return new ArrayIterator(getAllPixelColor());
    }

}
