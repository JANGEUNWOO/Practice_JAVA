package sec04_verify;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String[] days = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("��¥�� yyyy/mm/dd�� ���·� �Է��� �ּ���");
			String input = scan.nextLine();
			String[] date = input.split("/");
			cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1])-1, Integer.parseInt(date[2]));
			System.out.println("�Է��Ͻ� ��¥�� : " + days[cal.get(Calendar.DAY_OF_WEEK)-1]);
			scan.close();
			break;
			
			}catch(Exception e) {
					System.out.println("��Ĵ�� �Է��ϼ���");
				}
			}
	}

}
