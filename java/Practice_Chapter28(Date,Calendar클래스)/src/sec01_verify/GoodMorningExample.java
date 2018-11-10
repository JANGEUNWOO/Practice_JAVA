package sec01_verify;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		
		
		System.out.println("지금은 "+today.get(Calendar.HOUR)+"시 "+today.get(Calendar.MINUTE)+"분");
		
		
		
		if(today.get(Calendar.HOUR_OF_DAY)>=4&&today.get(Calendar.HOUR_OF_DAY)<=12) {
			System.out.print("오전이네요.  Good Morning");
		}else if(today.get(Calendar.HOUR_OF_DAY)<=18) {
			System.out.print("오후입니다.");
		}else if(today.get(Calendar.HOUR_OF_DAY)<=22) {
			System.out.print("저녁입니다.");
		}else {
			System.out.println("밤입니다.");
		}

	}

}
