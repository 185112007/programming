package design_patterns.goldman.objects.listeners;

import design_patterns.goldman.enums.ActionResult;
import design_patterns.goldman.objects.GoldMan;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, GoldMan goldMan);

}
