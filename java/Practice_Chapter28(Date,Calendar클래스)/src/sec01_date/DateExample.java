package sec01_date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
		// DateŬ������ time-Stamp�������
		Date now=new Date();
		String strNow1=now.toString();
		System.out.println(strNow1);
		
		//DateŬ������ ���� �ν��Ͻ� ������ simpleDateFormatŬ������ format()��
		//�̿��ؼ� ���ϴ� ���·� ����� �� �ִ�.
		SimpleDateFormat sdf=new SimpleDateFormat
				("yyyy�� mm�� dd�� E���� a hh�� mm�� ss��");
		
		String strNow2=sdf.format(now);
		System.out.println(strNow2);

	}

}
