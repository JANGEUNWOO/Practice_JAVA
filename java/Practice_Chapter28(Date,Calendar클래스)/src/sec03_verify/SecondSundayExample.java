package sec03_verify;

import java.util.Calendar;

public class SecondSundayExample {

	public static void main(String[] args) {
		
		
		Calendar date=Calendar.getInstance();
        date.set(2015, 12, 01);
        date.add(Calendar.DATE, 9);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 35);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 35);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 35);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 35);
        System.out.println(toString(date));
        date.add(Calendar.DATE, 28);
        System.out.println(toString(date));
        
	}
	
	
	public static String toString(Calendar date) {
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"
	     +date.get(Calendar.DATE)+"일은 2번째 일요일입니다.";
	}

}
