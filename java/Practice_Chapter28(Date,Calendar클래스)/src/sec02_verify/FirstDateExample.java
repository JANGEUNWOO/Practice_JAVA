package sec02_verify;

import java.util.Calendar;

public class FirstDateExample {
	 
	static void printCalendar(String msg, Calendar cal) {
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		final String[] AM_PM= {"오전","오후"};
		System.out.println(msg+cal.get(Calendar.YEAR)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.DATE)+"/"+DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]
				+"("+cal.get(Calendar.AM)+"시)"+AM_PM[cal.get(Calendar.AM_PM)]+
				cal.get(Calendar.HOUR)+"시 "+cal.get(Calendar.MINUTE)+"분 "+cal.get(Calendar.SECOND)+"초 "
				+cal.get(Calendar.MILLISECOND)+"밀리초");
		 }
	
	
	public static void main(String[] args) {
		
		
		 Calendar now = Calendar.getInstance();
			   printCalendar("현재 ", now);

	     Calendar firstDate = Calendar.getInstance();
			firstDate.clear();
			firstDate.set(2012, 11, 25); // 2012년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
			firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
			firstDate.set(Calendar.MINUTE, 30); // 30분
			   printCalendar("처음 데이트한 날은 ", firstDate);
			   
	}
}
