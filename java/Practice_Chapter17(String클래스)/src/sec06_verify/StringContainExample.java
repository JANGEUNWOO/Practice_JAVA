package sec06_verify;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��غ����� :");
		String input1=sc.nextLine();
		System.out.print("�� ��° ������ �Է��غ����� :");
		String input2=sc.nextLine();
		
		
		
	    
		System.out.println("���ڿ�1 ==> ["+input1+"]");
		System.out.println("���ڿ�2 ==> ["+input2+"]");
		
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("�Է��� �� ������ ���� �����̳׿�.");
		}
		
		if((input1.indexOf("java")!=-1&&input2.indexOf("java")!=-1)) {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ��ֳ׿�.");
		}

	}

}
