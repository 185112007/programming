package design_patterns.goldman.abstracts;

import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.MovingDirection;
import design_patterns.goldman.interfaces.gameobjects.MovingObject;
import design_patterns.goldman.objects.Coordinate;

/**
 * Hareketli nesnelerden sorumlu olan sınıf, 
 * hareket işlevlerinin eklenmesiyle AbstractGameObject sınıfından miras alınır
 */
public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObject {

    public abstract void changeIcon(MovingDirection direction);
    private int step = 1;// Tüm nesneler için varsayılan adım 1'dir.

    @Override
    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    protected void actionBeforeMove(MovingDirection direction) {

        // Nesneyi taşırken simgeyi değiştirmeli ve bir ses çıkarmalı
        changeIcon(direction);
    }

    @Override
    public ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject) {
        actionBeforeMove(direction);
        return doAction(gameObject);
    }

    @SuppressWarnings("incomplete-switch")
    public ActionResult doAction(AbstractGameObject gameObject) {

        if (gameObject == null) { // harita kenarı
            return ActionResult.NO_ACTION;
        }

        switch (gameObject.getType()) {

            case NOTHING: {
                return ActionResult.MOVE;
            }

            case WALL: {// Varsayılan olarak, nesne duvardan yürüyemez
                return ActionResult.NO_ACTION;
            }
        }

        return ActionResult.NO_ACTION;
    }

    @SuppressWarnings("incomplete-switch")
    public Coordinate getDirectionCoordinate(MovingDirection direction) {

        
        int x = this.getCoordinate().getX();
        int y = this.getCoordinate().getY();


        Coordinate newCoordinate = new Coordinate(x, y);


        switch (direction) {// hangi yöne gideceği belirle
            case UP: {
                newCoordinate.setY(y - this.getStep());
                break;
            }
            case DOWN: {
                newCoordinate.setY(y + this.getStep());
                break;
            }
            case LEFT: {
                newCoordinate.setX(x - this.getStep());
                break;
            }
            case RIGHT: {
                newCoordinate.setX(x + this.getStep());
                break;
            }
        }

        return newCoordinate;


    }
}
