package sec01_verify;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		
		
		System.out.println("������ "+today.get(Calendar.HOUR)+"�� "+today.get(Calendar.MINUTE)+"��");
		
		
		
		if(today.get(Calendar.HOUR_OF_DAY)>=4&&today.get(Calendar.HOUR_OF_DAY)<=12) {
			System.out.print("�����̳׿�.  Good Morning");
		}else if(today.get(Calendar.HOUR_OF_DAY)<=18) {
			System.out.print("�����Դϴ�.");
		}else if(today.get(Calendar.HOUR_OF_DAY)<=22) {
			System.out.print("�����Դϴ�.");
		}else {
			System.out.println("���Դϴ�.");
		}

	}

}
