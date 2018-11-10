package sec01_verify;

import java.util.Scanner;

public class Exercise5_if {

	public static void main(String[] args) {
		
		
		int position;
		System.out.print("알고싶은 월급 중 해당직급을 입력하세요 :");
		
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
		
		if(position==1) {
			System.out.println("상무직급은 1000만원/월 입니다.");
		} else if(position==2) {
			System.out.println("부장직급은 800만원/월 입니다.");
		} else if(position==3) {
			System.out.println("차장직급은 600만원/월 입니다.");
		} else if(position==4) {
			System.out.println("과장직급은 400만원/월 입니다.");
		} else if(position==5) {
			System.out.println("대리직급은 250만원/월 입니다.");
		} else if(position==6) {
			System.out.println("사원직급은 180만원/월 입니다.");
		} else {
			System.out.println("오류입니다");
		}
		
		
		sc.close();

	}

}
