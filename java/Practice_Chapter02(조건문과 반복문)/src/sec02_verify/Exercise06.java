package sec02_verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		
		int num=0;
		System.out.print("������ �Է�:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num%3==0) {
			System.out.println("3�� ����Դϴ�.");
			break;
			
		}
		sc.close();

	}

}
