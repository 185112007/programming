package design_patterns.goldman.interfaces.gamemap;

/**
 * oyun haritası icin arayuz
 */
public interface GameMap {

    int getHeight();

    int getWidth();

    int getTimeLimit();

    boolean loadMap(Object source);

    boolean saveMap(Object source);
}
