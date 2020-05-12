package _030_yardimci_siniflar.ex_05;

import java.util.Date;

public class DateSinifi {

	public static void main(String[] args) throws InterruptedException {
		
		final Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		final long simdikiZaman = System.currentTimeMillis();
		System.out.println(new Date(simdikiZaman));
		
		//tarih kiyaslama
		final  Date date1 = new Date();
		
		uyu();
		
		final Date date2 = new Date();
		System.out.println(date1.before(date2));
		System.out.println(date2.after(date1));
	}

	private static void uyu() throws InterruptedException {
		
		Thread.sleep(1000);
		
	}

}
