package design_patterns.goldman.movestrategies;

import java.util.Random;
import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.abstracts.AbstractMovingObject;
import design_patterns.goldman.enums.MovingDirection;
import design_patterns.goldman.interfaces.gamemap.collections.GameCollection;

public class SlowMoving implements MoveStrategy {
    

    @Override
    public MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection) {

        MovingDirection direction = null;

        int characterX = targetObject.getCoordinate().getX();
        int characterY = targetObject.getCoordinate().getY();

        int monsterX = movingObject.getCoordinate().getX();
        int monsterY = movingObject.getCoordinate().getY();

        int number = getRandomInt(2);
        
        if (number == 1) { 
            
            number = getRandomInt(2);
            switch (number) {
                case 1: {
                    if (monsterX > characterX) {
                        direction = MovingDirection.LEFT;
                    } else {
                        direction = MovingDirection.RIGHT;
                    }
                    break;
                }
                case 2: {
                    if (monsterY > characterY) {
                        direction = MovingDirection.UP;
                    } else {
                        direction = MovingDirection.DOWN;
                    }
                    break;
                }

            }
        } else { 
            number = getRandomInt(2);
            switch (number) {
                case 1: {
                    if (monsterX > characterX) {
                        direction = MovingDirection.RIGHT;
                    } else {
                        direction = MovingDirection.LEFT;
                    }
                    break;
                }
                case 2: {
                    if (monsterY > characterY) {
                        direction = MovingDirection.DOWN;
                    } else {
                        direction = MovingDirection.UP;
                    }
                    break;
                }
            }
        }


        return direction;
    }

    private int getRandomInt(int i) {
        Random r = new Random();
        return r.nextInt(i) + 1;
    }
}
