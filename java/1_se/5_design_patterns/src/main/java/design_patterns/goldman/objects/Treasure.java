package design_patterns.goldman.objects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.GameObjectType;


/**
 * 
 */
public class Treasure extends AbstractGameObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/design_patterns/goldman/images/gold.png"));
    }
    
    
    private int score = 5;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
