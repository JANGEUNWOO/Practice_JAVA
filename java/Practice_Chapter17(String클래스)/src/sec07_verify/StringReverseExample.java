package sec07_verify;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		
		//���� �ڹٸ� ����մϴ�.�Է�
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input=sc.nextLine();
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(input);
		
		System.out.println(strBuffer.reverse());
		

	}
}
