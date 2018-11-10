package sec02_verify;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		
		int num=0;
		System.out.print("정수의 입력:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num%3==0) {
			System.out.println("3의 배수입니다.");
			break;
			
		}
		sc.close();

	}

}
