package design_patterns.goldman.objects.listeners;

import java.util.List;
import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.objects.GoldMan;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllLMoveisteners();

    public void notifyMoveListeners(ActionResult actionResult, GoldMan goldMan);

}
