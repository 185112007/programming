package design_patterns.course._08_observer.source;

public class OyunPaneliBildirimi implements BildirimServisi
{
    private Player player;
    
    public OyunPaneliBildirimi(Player p)
    {
	player = p;
    }
    
    @Override
    public void update()
    {
	System.out.println("Oyun paneli bildirimi aldı");
    }

    @Override
    public void subscribe()
    {
	player.addService(this);
    }

    @Override
    public void unsubscribe()
    {
	player.removeService(this);
    }

}
