package sec04_verify;

import java.util.Scanner;

public class StringMetodWithExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ� �Է� ==> ");//���� �ڹٸ� �����մϴ�.
		String input=sc.nextLine();
		
		
		System.out.println("�Է� ���ڿ��� ���۰� ���� ���� '(' ')'�� �ƴϸ�, '(' ')'�ٿ� ����մϴ�. ");

		if(input.startsWith("(")&&input.endsWith(")")) {
		System.out.println(input);
		}else
		System.out.println("��� ���ڿ� ==> ("+input+")");
	}

}
