package sec02_verify;

import java.util.Calendar;

public class FirstDateExample {
	 
	static void printCalendar(String msg, Calendar cal) {
		final String[] DAY_OF_WEEK= {"","��","��","ȭ","��","��","��","��"};
		final String[] AM_PM= {"����","����"};
		System.out.println(msg+cal.get(Calendar.YEAR)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.DATE)+"/"+DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)]
				+"("+cal.get(Calendar.AM)+"��)"+AM_PM[cal.get(Calendar.AM_PM)]+
				cal.get(Calendar.HOUR)+"�� "+cal.get(Calendar.MINUTE)+"�� "+cal.get(Calendar.SECOND)+"�� "
				+cal.get(Calendar.MILLISECOND)+"�и���");
		 }
	
	
	public static void main(String[] args) {
		
		
		 Calendar now = Calendar.getInstance();
			   printCalendar("���� ", now);

	     Calendar firstDate = Calendar.getInstance();
			firstDate.clear();
			firstDate.set(2012, 11, 25); // 2012�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ����
			firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8��
			firstDate.set(Calendar.MINUTE, 30); // 30��
			   printCalendar("ó�� ����Ʈ�� ���� ", firstDate);
			   
	}
}
