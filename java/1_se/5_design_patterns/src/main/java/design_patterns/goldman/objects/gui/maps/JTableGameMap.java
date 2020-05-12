package design_patterns.goldman.objects.gui.maps;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import design_patterns.goldman.abstracts.AbstractGameMap;
import design_patterns.goldman.abstracts.AbstractGameObject;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.enums.GameObjectType;
import design_patterns.goldman.enums.LocationType;
import design_patterns.goldman.interfaces.gamemap.collections.GameCollection;
import design_patterns.goldman.interfaces.gamemap.DrawableMap;
import design_patterns.goldman.movestrategies.AgressiveMoving;
import design_patterns.goldman.objects.Coordinate;
import design_patterns.goldman.objects.GoldMan;
import design_patterns.goldman.objects.Nothing;
import design_patterns.goldman.objects.Wall;
import design_patterns.goldman.objects.creators.MapCreator;
import design_patterns.goldman.objects.listeners.MoveResultListener;

public class JTableGameMap implements DrawableMap {

    private JTable jTableMap = new JTable();
    private AbstractGameMap gameMap;
    private String[] columnNames;
    
    private AbstractGameObject[][] mapObjects;

    public JTableGameMap(LocationType type, Object source, GameCollection gameCollection) {
        jTableMap.setEnabled(false);
        jTableMap.setSize(new java.awt.Dimension(300, 300));
        jTableMap.setRowHeight(26);
        jTableMap.setRowSelectionAllowed(false);
        jTableMap.setShowHorizontalLines(false);
        jTableMap.setShowVerticalLines(false);
        jTableMap.setTableHeader(null);
        jTableMap.setUpdateSelectionOnSort(false);
        jTableMap.setVerifyInputWhenFocusTarget(false);

        gameMap = MapCreator.getInstance().createMap(type, gameCollection);
        gameMap.loadMap(source);
   
        timeMover = new TimeMover();
    }


    private void fillEmptyMap(int width, int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                mapObjects[y][x] = new Nothing(new Coordinate(x, y));
            }
        }
    }

    private void updateObjectsArray() {

        mapObjects = new AbstractGameObject[gameMap.getHeight()][gameMap.getWidth()];

        fillEmptyMap(gameMap.getWidth(), gameMap.getHeight());

        // потом заполнить массив объектами		
        for (AbstractGameObject gameObj : gameMap.getGameCollection().getAllGameObjects()) {
            if (!gameObj.getType().equals(GameObjectType.NOTHING)) {
                int y = gameObj.getCoordinate().getY();
                int x = gameObj.getCoordinate().getX();
                if (!(mapObjects[y][x] instanceof Nothing) & 
                        !(mapObjects[y][x] instanceof Wall)) {
                    AbstractGameObject tmpObj = mapObjects[y][x];
                    mapObjects[y][x] = gameMap.getPriorityObject(tmpObj, gameObj);
                } else {
                    mapObjects[y][x] = gameObj;
                }
            }
        }
    }

    @Override
    public boolean drawMap() {

        updateObjectsArray();

        try {
            
            columnNames = new String[gameMap.getWidth()];

            for (int i = 0; i < columnNames.length; i++) {
                columnNames[i] = "";
            }

            jTableMap.setModel(new DefaultTableModel(mapObjects, columnNames));

            for (int i = 0; i < jTableMap.getColumnCount(); i++) {
                jTableMap.getColumnModel().getColumn(i).setCellRenderer(new ImageRenderer());
                TableColumn a = jTableMap.getColumnModel().getColumn(i);
                a.setPreferredWidth(26);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


        return true;
    }

    @Override
    public Component getMapComponent() {
        return jTableMap;
    }

    @Override
    public AbstractGameMap getGameMap() {
        return gameMap;
    }
 


    @SuppressWarnings("unused")
    private TimeMover timeMover;

    private class TimeMover implements ActionListener, MoveResultListener {

        private Timer timer;
        private final static int MOVING_PAUSE = 500;
        private final static int INIT_PAUSE = 1000;

        private TimeMover() {
            timer = new Timer(MOVING_PAUSE, this);
            timer.setInitialDelay(INIT_PAUSE);
            timer.start();
            gameMap.getGameCollection().addMoveListener(this);
        }

        @SuppressWarnings("unused")
	public void start() {
            timer.start();
        }

        @SuppressWarnings("unused")
	public void stop() {
            timer.stop();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            gameMap.getGameCollection().moveObject(new AgressiveMoving(), GameObjectType.MONSTER);
        }

        @SuppressWarnings("incomplete-switch")
	@Override
        public void notifyActionResult(ActionResult actionResult, GoldMan goldMan) {
            switch (actionResult){
                case DIE: case WIN:{
                    timer.stop();
                    break;
                }
            }
        }
    }
 
}
