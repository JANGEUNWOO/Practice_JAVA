package sec01_date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
		// Date클래스는 time-Stamp기능으로
		Date now=new Date();
		String strNow1=now.toString();
		System.out.println(strNow1);
		
		//Date클래스를 통해 인스턴스 생성후 simpleDateFormat클래스의 format()를
		//이용해서 원하는 형태로 출력할 수 있다.
		SimpleDateFormat sdf=new SimpleDateFormat
				("yyyy년 mm월 dd일 E요일 a hh시 mm분 ss초");
		
		String strNow2=sdf.format(now);
		System.out.println(strNow2);

	}

}
