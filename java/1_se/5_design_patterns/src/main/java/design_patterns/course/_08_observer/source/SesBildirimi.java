package design_patterns.course._08_observer.source;

public class SesBildirimi implements BildirimServisi
{
    private Player player;
    
    public SesBildirimi(Player p)
    {
	player = p;
    }
    
    @Override
    public void update()
    {
	System.out.println("SesBildirim servisi degisiklikleri aldı");
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
