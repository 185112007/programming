package design_patterns.goldman.movestrategies;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.abstracts.AbstractMovingObject;
import design_patterns.goldman.enums.MovingDirection;
import design_patterns.goldman.interfaces.gamemap.collections.GameCollection;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
