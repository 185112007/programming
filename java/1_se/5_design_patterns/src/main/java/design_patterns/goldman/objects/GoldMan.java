package design_patterns.goldman.objects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.abstracts.AbstractMovingObject;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.GameObjectType;
import design_patterns.goldman.enums.MovingDirection;

/**
 * 
 */
public class GoldMan extends AbstractMovingObject {

    private int totalScore = 0;
    private int turnsNumber = 0;

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/design_patterns/goldman/images/goldman_up.png"));
    }

    public void addSTotalcore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
    }

    @SuppressWarnings("incomplete-switch")
    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/goldman_down.png"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/goldman_left.png"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/goldman_right.png"));
                break;
            case UP:
                super.setIcon(getImageIcon("/design_patterns/goldman/images/goldman_up.png"));
                break;
        }
    }

    @SuppressWarnings("incomplete-switch")
    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        turnsNumber++;

        switch (gameObject.getType()) {

            case TREASURE: {
                totalScore += ((Treasure) gameObject).getScore();
                return ActionResult.COLLECT_TREASURE;
            }

            case MONSTER:  {
                return ActionResult.DIE;
            }
                
            case EXIT:{
                totalScore *= 2;
                return ActionResult.WIN;
            }
                
        }

        return super.doAction(gameObject);
    }
}
