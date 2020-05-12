package design_patterns.course._09_memento.source;

import design_patterns.course._09_memento.source.enums.GameObjectType;
import design_patterns.course._09_memento.source.impl.GoldMan;
import design_patterns.course._09_memento.source.impl.Monster;
import design_patterns.course._09_memento.source.impl.Wall;

public class Client
{

    public static void main(String[] args)
    {
	final GameObjects gameObject = new GameObjects();
	gameObject.addObject(0, new GoldMan(GameObjectType.GOLDMAN));
	gameObject.addObject(1, new Monster(GameObjectType.MONSTER));
	gameObject.addObject(2, new Monster(GameObjectType.MONSTER));
	gameObject.addObject(3, new Monster(GameObjectType.MONSTER));
	
	// GameObjects son halini memento nesnesine
	// aktarıyoruz.
	final Memento memento = gameObject.createMemento();
	
	System.out.println("GameObjects ilk hali:");
	System.out.println(gameObject.toString());
	
	// GameObjects üzerinde değişiklik yapıyoruz.
	gameObject.removeObject(2);
	gameObject.addObject(2, new Wall(GameObjectType.WALL));
	System.out.println("\n\nGameObjects yeni hali:");
	System.out.println(gameObject.toString());
	
	// GameObjects eski haline dönüstürüyoruz
	gameObject.setMemento(memento);
	System.out.println("\n\nGameObjects en son hali:");
	System.out.println(gameObject.toString());
    }

}
