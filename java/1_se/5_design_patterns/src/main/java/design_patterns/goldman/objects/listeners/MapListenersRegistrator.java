package design_patterns.goldman.objects.listeners;

import java.util.ArrayList;
import java.util.List;
import design_patterns.goldman.interfaces.gamemap.collections.GameCollection;

public abstract class MapListenersRegistrator implements GameCollection{

    private ArrayList<MoveResultListener> listeners = new ArrayList<>();

    @Override
    public List<MoveResultListener> getMoveListeners() {
        return listeners;
    }

    @Override
    public void addMoveListener(MoveResultListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeMoveListener(MoveResultListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllLMoveisteners() {
        listeners.clear();
    }

 
    
}
