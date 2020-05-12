package design_patterns.course._02_factory.source;

public class FactoryTest
{

    public static void main(String[] args)
    {
	AbstractGameObject nothing = GameObjectCreator.createObject(GameObjectType.NOTHING);
	AbstractGameObject wall = GameObjectCreator.createObject(GameObjectType.WALL);
	AbstractGameObject monster = GameObjectCreator.createObject(GameObjectType.MONSTER);
	AbstractGameObject treasure = GameObjectCreator.createObject(GameObjectType.TREASURE);
	AbstractGameObject exit = GameObjectCreator.createObject(GameObjectType.EXIT);
	AbstractGameObject goldman = GameObjectCreator.createObject(GameObjectType.GOLDMAN);

	System.out.println(nothing.getType());
	System.out.println(wall.getType());
	System.out.println(monster.getType());
	System.out.println(treasure.getType());
	System.out.println(exit.getType());
	System.out.println(goldman.getType());
    }

}
