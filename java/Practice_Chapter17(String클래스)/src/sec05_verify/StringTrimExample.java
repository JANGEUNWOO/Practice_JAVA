package sec05_verify;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��غ�����:");
		String input=sc.nextLine();
		System.out.println("�Է��� ���ڿ� : ["+input+"]");
		input=input.replaceAll("\\p{Z}","");
		System.out.println("�������Ÿ� �� ���ڿ� : ["+input+"]");
		

	}

}
