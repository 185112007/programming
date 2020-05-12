package design_patterns.goldman.abstracts;


import java.util.Objects;
import design_patterns.goldman.objects.Coordinate;
import design_patterns.goldman.enums.GameObjectType;
import javax.swing.ImageIcon;
import design_patterns.goldman.interfaces.gameobjects.StaticObject;

/**
 * Oyunda yaratılan herhangi bir nesneden sorumlu olan sınıf, 
 * oyundaki nesnelerin tüm genel özelliklerini belirler.
 */
public abstract class AbstractGameObject implements StaticObject {
    
    private GameObjectType type;// tüm nesneler bir tipi olacak
    private Coordinate coordinate;// tüm nesnelerin pozisyon koordinatları olacaktır
    
    private ImageIcon icon = getImageIcon("/design_patterns/goldman/images/noicon.png");// varsayılan resim

    protected AbstractGameObject() {
    }

    public void setIcon(ImageIcon currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    
    protected ImageIcon getImageIcon(String path){
        return new ImageIcon(getClass().getResource(path));
    }
    
    @Override
    public GameObjectType getType() {
        return type;
    }

    public void setType(GameObjectType type) {
        this.type = type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 37 * hash + Objects.hashCode(this.coordinate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

   
}
