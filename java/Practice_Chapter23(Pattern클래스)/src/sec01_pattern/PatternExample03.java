package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

	public static void main(String[] args) {
		
		
		//���ڿ��� ������ �ִ� �������� �����Ǿ� �մ��� ����
		String regExp="(010)-\\d{3,4}-\\d{4}";
		//String regExp="(010|02|053)-\\d{3,4}-\\d{4}";
		
		String date="010-123-4567";
		//String date="053-123-4567";
		
		boolean result=Pattern.matches(regExp, date);
		
		if(result) {
			System.out.println("��ȭ��ȣ ���Խİ� ��ġ�մϴ�.");
			
		}else {			System.out.println("��ȭ��ȣ ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		//?�� ���� �Ǵ� 1���� �ǹ���.
		regExp="\\w+@\\w+(\\.\\w+)?";
		//date="angel@naver.com";
		date="angel@naver.com";
		//date="angel@naver.co.kr";
		result=Pattern.matches(regExp, date);
		
		if(result) {
			System.out.println("�̸��� ���Խİ� ��ġ�մϴ�.");
		}else {
				System.out.println("�̸��� ���Խİ� ��ġ���� �ʽ��ϴ�.");
			}
		}

}


