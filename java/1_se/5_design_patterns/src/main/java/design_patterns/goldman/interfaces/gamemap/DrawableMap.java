package design_patterns.goldman.interfaces.gamemap;

import java.awt.Component;
import design_patterns.goldman.abstracts.AbstractGameMap;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
