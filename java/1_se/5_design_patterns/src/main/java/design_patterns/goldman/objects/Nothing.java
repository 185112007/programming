package design_patterns.goldman.objects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.GameObjectType;

/**
 * 
 */
public class Nothing extends AbstractGameObject {

    public Nothing(Coordinate coordinate) {
        super.setType(GameObjectType.NOTHING);
        super.setCoordinate(coordinate);
        super.setIcon(null);

    }
}
