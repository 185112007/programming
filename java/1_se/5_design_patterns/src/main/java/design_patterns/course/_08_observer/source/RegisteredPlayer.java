package design_patterns.course._08_observer.source;

import java.util.ArrayList;
import java.util.List;

public class RegisteredPlayer implements Player
{
    private List<BildirimServisi> servisler = new ArrayList<>();
    
    @Override
    public void addService(BildirimServisi b)
    {
	servisler.add(b);
    }

    @Override
    public void removeService(BildirimServisi b)
    {
	servisler.remove(b);
    }

    @Override
    public void bilgilendir()
    {
	for (int i = 0; i < servisler.size(); i++)
	{
	    servisler.get(i).update();
	}
    }

}
