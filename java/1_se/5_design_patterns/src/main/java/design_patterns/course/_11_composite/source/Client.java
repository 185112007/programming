package design_patterns.course._11_composite.source;

public class Client
{

    public static void main(String[] args)
    {
	
	final Game game = new Game(GameObjectType.GAME);
	
	final GameObject monster = new Monster(GameObjectType.MONSTER);
	final GameObject goldman = new GoldMan(GameObjectType.GOLDMAN);
	final GameObject wall = new Wall(GameObjectType.WALL);
	
	
	game.addComponent(goldman);
	game.addComponent(wall);
	game.addComponent(monster);
	
	System.out.println("goldman type: " + goldman.getType());
	System.out.println("wall type: " + wall.getType());
	System.out.println("monster type: " + monster.getType());
	System.out.println("game type: " + game.getType());
    }

}
