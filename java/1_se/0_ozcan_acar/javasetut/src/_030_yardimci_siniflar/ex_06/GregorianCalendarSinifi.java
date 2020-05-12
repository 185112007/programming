package _030_yardimci_siniflar.ex_06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarSinifi {

	public static void main(String[] args) {
		
		final GregorianCalendar calendar = new GregorianCalendar();
		
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 18);
		
		System.out.println("Sene         : " + calendar.get(Calendar.YEAR));
		System.out.println("Ay           : " + calendar.get(Calendar.MONTH));
		System.out.println("Ayin Gunu    : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Haftanin Gunu: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Yilin Haftasi: " + calendar.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("Saat         : " + calendar.get(Calendar.HOUR));
		System.out.println("Gunun saati  : " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Dakika       : " + calendar.get(Calendar.MINUTE));
		System.out.println("Saniye       : " + calendar.get(Calendar.SECOND));
		System.out.println("Sadise       : " + calendar.get(Calendar.MILLISECOND));
	}

}
