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
		final String[] DAY_OF_WEEK= {"","��","��","ȭ","��","��","��","��"};
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"
	     +date.get(Calendar.DATE)+"���� 2��° �Ͽ����Դϴ�.";
	}

}
