package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fahrenheit=scanner.nextInt();
		float celcius = (float)((fahrenheit - 32)/1.8);
		
		System.out.println("ȭ���µ��� �Է��ϼ��� :"+fahrenheit);
		System.out.println("�Է��� ȭ���µ��� �����µ��� ��ȯ�� �� : " + celcius);
		
		scanner.close();
		
	}

}
