package design_patterns.course._04_objectpool.source;

public class ObjectPoolTest
{

    public static void main(String[] args)
    {
	MonsterPool pool = MonsterPool.instance();
	System.out.println(pool.toString());
	
	Monster monster = pool.checkOut();
	System.out.println(pool.toString());
	
	pool.checkIn(monster);
	System.out.println(pool.toString());
    }

}
