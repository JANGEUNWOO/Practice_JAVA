package sec02_calendar;

import java.util.Calendar;

public class CalendarExample04 {

	public static void main(String[] args) {


		Calendar date=Calendar.getInstance();
		
		date.set(2016, 10, 1); //2015년 11월 1일로 셋팅
		System.out.println(toString(date));
		System.out.println("=1일 후 =");
		date.add(Calendar.DATE,1);
		System.out.println(toString(date));
		
		System.out.println("=12달 전=");
		date.add(Calendar.MONTH, -12);
		System.out.println(toString(date));
		
		System.out.println("=35일 후(add)=");
		date.add(Calendar.DATE, 35);
		System.out.println(toString(date));
		
		//roll메서드는 다른 필드에 명령을 주지 않는다.
		System.out.println("=25일 후(roll)=");
		date.roll(Calendar.DATE, 25);
		System.out.println(toString(date));

	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"
	     +date.get(Calendar.DATE)+"일";
	}

}
