package sec02_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		
		int num;
		System.out.print("�ϳ��� ������ �Է��ϼ���:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		
		
		while(num%2==0&&num%3==0) {
			System.out.println(num+"(��/��)2�� 3�� ����Դϴ�.");
			break;
		}
		
         sc.close();
	}

}
