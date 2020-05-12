/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.goldman.interfaces.gameobjects;

import design_patterns.goldman.objects.Coordinate;
import javax.swing.ImageIcon;
import design_patterns.goldman.enums.GameObjectType;

/**
 *
 * @author Gafur
 */
public interface StaticObject {
 
    // nesnenin bir ikonu olacak
    ImageIcon getIcon();

    // koordinat
    Coordinate getCoordinate();

    // nesne tipi
    GameObjectType getType();
    
            
}
