package sec02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		//오는 Timezone의 ID값을 얻는다.
		String[] availableIDs =TimeZone.getAvailableIDs();
		
		for(String id:availableIDs) {
			System.out.println(id);
		}
		TimeZone tz=TimeZone.getTimeZone("Europe/Paris");
		Calendar now=Calendar.getInstance(tz);
		
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONDAY)+1;
		int day=now.get(Calendar.DAY_OF_MONTH);
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		System.out.println(year+"년"+month+"월"+day+"일"+hour+"시"+minute+"분"+second+"초");

	}

}
