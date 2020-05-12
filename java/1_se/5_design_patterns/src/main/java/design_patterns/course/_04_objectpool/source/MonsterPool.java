package design_patterns.course._04_objectpool.source;

public class MonsterPool extends ObjectPool<Monster>
{

    private static volatile MonsterPool instance = null;

    /**
     * Double check locking yapabilmek icin kullanilan nesne
     */
    private static Object lock = new Object();
    
    /**
     * Singleton sinifindan olusturulabilecek tek nesneye ulasmak icin insatnce()
     * metodu kullanilmaktadir.
     */
    public static MonsterPool instance()
    {
	if (instance == null)
	{
	    // double checked locking
	    synchronized (lock)
	    {
		if (instance == null)
		{
		    instance = new MonsterPool();
		}
	    }
	}
	return instance;
    }
    
    @Override
    protected Monster create()
    {
	// TODO Auto-generated method stub
	return new Monster(GameObjectType.MONSTER);
    }

}
