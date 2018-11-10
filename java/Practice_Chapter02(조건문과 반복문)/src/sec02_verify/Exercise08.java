package sec02_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		
		int num;
		System.out.print("하나의 정수를 입력하세요:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		
		
		while(num%2==0&&num%3==0) {
			System.out.println(num+"(은/는)2와 3의 배수입니다.");
			break;
		}
		
         sc.close();
	}

}
