package design_patterns.goldman.movestrategies;

import java.util.Random;
import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.abstracts.AbstractMovingObject;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.MovingDirection;
import design_patterns.goldman.interfaces.gamemap.collections.GameCollection;

public class AgressiveMoving implements MoveStrategy {

    private MovingDirection[] directions = MovingDirection.values();
    private AbstractMovingObject movingObject;
    private GameCollection gameCollection;

    @Override
    public MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection) {

        this.movingObject = movingObject;
        this.gameCollection = gameCollection;

        MovingDirection direction = searchAction(ActionResult.DIE, false);

        if (direction == null) {
            direction = searchAction(ActionResult.MOVE, true);
        }

        return direction;
    }

    private MovingDirection getRandomDirection() {
        return directions[new Random().nextInt(directions.length)];
    }

    private MovingDirection searchAction(ActionResult actionResult, boolean random) {
        MovingDirection direction = null;

        if (random) {
            do {
                direction = getRandomDirection();
            } while (!checkActionResult(actionResult, direction));
        }else{
            for (MovingDirection movingDirection : directions) {
                if (checkActionResult(actionResult, movingDirection)){
                    direction = movingDirection;
                    break;
                }
            }
        }

        return direction;
    }
    
    private boolean checkActionResult(ActionResult actionResult, MovingDirection direction){
        AbstractGameObject objectInNewCoordinate = gameCollection.getObjectByCoordinate(movingObject.getDirectionCoordinate(direction));     
        return movingObject.doAction(objectInNewCoordinate).equals(actionResult);
    }
}
