package sec05_verify;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DayDifferenceExample {

		public static void main(String[] args) {
			try {
			System.out.println("2016��01��03�� - 2016�� 02�� 01���� ���� : " + getDayDiff("20160103","20160201") + "��");
			System.out.println("2016��01��03�� - 2016�� 01�� 03���� ���� : " + getDayDiff("20160103","20160103") + "��");
			System.out.println(" " + getDayDiff("20010103","200103"));
			}
			catch(Exception e) {
				System.out.println("�Ľ� ���� �߻�");
			}
		}
		
		public static long getDayDiff(String s1, String s2) throws Exception {
			
			SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
			Date date1 = myFormat.parse(s1);
		    Date date2 = myFormat.parse(s2);
		    long diff = date2.getTime() - date1.getTime();
			return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		}
}


