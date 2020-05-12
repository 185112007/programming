package design_patterns.goldman.interfaces.gamemap.collections;

import java.util.List;
import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.GameObjectType;
import design_patterns.goldman.enums.MovingDirection;
import design_patterns.goldman.movestrategies.MoveStrategy;
import design_patterns.goldman.objects.Coordinate;
import design_patterns.goldman.objects.listeners.MoveResultNotifier;

public interface GameCollection extends MoveResultNotifier{
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    void moveObject(MovingDirection direction, GameObjectType gameObjectType);
    
    void moveObject(MoveStrategy moveStrategy, GameObjectType gameObjectType);

}
