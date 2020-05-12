package design_patterns.course._01_singleton.source;

public class SingletonTest
{

    public static void main(String[] args)
    {
	GameZoneSingleton gameZone = GameZoneSingleton.instance();

	gameZone.printAllObjectTypes();
    }

}
