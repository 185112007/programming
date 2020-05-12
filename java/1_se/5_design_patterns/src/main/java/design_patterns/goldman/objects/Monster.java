package design_patterns.goldman.objects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.abstracts.AbstractMovingObject;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.GameObjectType;
import design_patterns.goldman.enums.MovingDirection;

/**
 * 
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIcon(getImageIcon("/design_patterns/goldman/images/monster_up.jpg"));

    }

    @SuppressWarnings("incomplete-switch")
    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/monster_down.jpg"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/monster_right.jpg"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/monster_right.jpg"));
                break;
            case UP:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/monster_up.jpg"));
                break;
        }
    }

    @SuppressWarnings("incomplete-switch")
    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        switch (gameObject.getType()) {


            case TREASURE:
            case MONSTER: { 
                return ActionResult.NO_ACTION;
            }

            case GOLDMAN: {
                return ActionResult.DIE;
            }

        }

        return super.doAction(gameObject);
    }
}
