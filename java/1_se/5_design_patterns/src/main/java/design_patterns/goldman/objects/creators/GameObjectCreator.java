package design_patterns.goldman.objects.creators;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.GameObjectType;
import design_patterns.goldman.objects.Coordinate;
import design_patterns.goldman.objects.Exit;
import design_patterns.goldman.objects.GoldMan;
import design_patterns.goldman.objects.Monster;
import design_patterns.goldman.objects.Nothing;
import design_patterns.goldman.objects.Treasure;
import design_patterns.goldman.objects.Wall;

public class GameObjectCreator {

    private static GameObjectCreator instance;

    public static GameObjectCreator getInstance() {
        if (instance == null) {
            instance = new GameObjectCreator();
        }
        return instance;
    }

    private GameObjectCreator() {
    }

    public AbstractGameObject createObject(GameObjectType type, Coordinate coordinate) {
        AbstractGameObject obj = null;

        switch (type) {
            case NOTHING: {
                obj = new Nothing(coordinate);
                break;
            }
            case WALL: {
                obj = new Wall(coordinate);
                break;
            }
            case MONSTER: {
                obj = new Monster(coordinate);
                break;
            }
            case TREASURE: {
                obj = new Treasure(coordinate);
                break;
            }
            case EXIT: {
                obj = new Exit(coordinate);
                break;
            }

            case GOLDMAN: {
                obj = new GoldMan(coordinate);
                break;
            }

            default:
                throw new IllegalArgumentException("Can't create object type: " + type);

        }

        return obj;
    }
}
