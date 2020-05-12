package design_patterns.course._08_observer.source;

public class Test
{

    public static void main(String[] args)
    {
	Player player = new RegisteredPlayer();
	
	BildirimServisi ses = new SesBildirimi(player);
	BildirimServisi panel = new OyunPaneliBildirimi(player);
	
	System.out.println("1.durum: abone yok");
	player.bilgilendir();
	System.out.println("son...");
	
	System.out.println("2.durum: ses sistemi oyuncuyu takip ediyor");
	ses.subscribe();
	player.bilgilendir();
	System.out.println("son...");
	
	System.out.println("3.durum: panel bildirimide oyuncuyu takip ediyor");
	panel.subscribe();
	player.bilgilendir();
	System.out.println("son...");
	
	System.out.println("4.durum: ses sistemini devre disi biraktik");
	ses.unsubscribe();
	player.bilgilendir();
	System.out.println("son...");
    }

}
