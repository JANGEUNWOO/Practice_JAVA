package sec02_verify;

import java.util.Scanner;

public class Exercise08_1 {

	public static void main(String[] args) {
		
		
		int num;
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하시오:");
		num=sc.nextInt();
		
		System.out.print("두번째 수를 입력하시오:");
		num1=sc.nextInt();
		
		System.out.println(num+"과"+num1+"에서 3과 4를 제외한 결과");
		
		for(int i=num; i<=num1; i++) {
			if(i%3==0||i%4==0) {
				continue;
			}
			System.out.println();
		}
         sc.close();
	}

}
