package design_patterns.goldman.objects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.GameObjectType;


/**
 * 
 */
public class Wall extends AbstractGameObject{

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/design_patterns/goldman/images/wall.png"));

    }
}
