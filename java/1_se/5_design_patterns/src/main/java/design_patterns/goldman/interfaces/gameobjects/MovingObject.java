package design_patterns.goldman.interfaces.gameobjects;

import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.MovingDirection;

/**
 *
 * tüm hareketli nesneler için davranış: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject); 
    
    int getStep();
       
}
