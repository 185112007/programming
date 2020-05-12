package design_patterns.course._01_singleton.source;

public class GameZoneSingleton
{
    private AbstractGameObject nothing;
    private AbstractGameObject wall;
    private AbstractGameObject monster;
    private AbstractGameObject treasure;
    private AbstractGameObject exit;
    private AbstractGameObject goldman;

    private static volatile GameZoneSingleton instance = null;

    /**
     * Double check locking yapabilmek icin kullanilan nesne
     */
    private static Object lock = new Object();

    /**
     * Baska siniflarin new Singleton() seklinde nesne olusturmalari ile engellenmis
     * olmakla
     */
    private GameZoneSingleton()
    {
	initGameObjects();
    }

    private void initGameObjects()
    {
	nothing = GameObjectFactory.createObject(GameObjectType.NOTHING);
	wall = GameObjectFactory.createObject(GameObjectType.WALL);
	monster = GameObjectFactory.createObject(GameObjectType.MONSTER);
	treasure = GameObjectFactory.createObject(GameObjectType.TREASURE);
	exit = GameObjectFactory.createObject(GameObjectType.EXIT);
	goldman = GameObjectFactory.createObject(GameObjectType.GOLDMAN);
    }

    /**
     * Singleton sinifindan olusturulabilecek tek nesneye ulasmak icin insatnce()
     * metodu kullanilmaktadir.
     */
    public static GameZoneSingleton instance()
    {
	if (instance == null)
	{
	    // double checked locking
	    synchronized (lock)
	    {
		if (instance == null)
		{
		    instance = new GameZoneSingleton();
		}
	    }
	}
	return instance;
    }

    public void printAllObjectTypes()
    {
	System.out.println(nothing.getType());
	System.out.println(wall.getType());
	System.out.println(monster.getType());
	System.out.println(treasure.getType());
	System.out.println(exit.getType());
	System.out.println(goldman.getType());
    }
}
