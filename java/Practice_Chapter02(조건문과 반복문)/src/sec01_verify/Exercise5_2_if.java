package sec01_verify;

import java.util.Scanner;

public class Exercise5_2_if {

	public static void main(String[] args) {
		
		char gender;
		String regNo="";
		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) : ");
		
		Scanner sc=new Scanner(System.in);
		regNo=sc.nextLine();
		
		gender=regNo.charAt(7);
		
		if((gender=='1')||(gender=='3')) {
			System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
		} else if((gender=='2')||(gender=='4')) {
			System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
		}
      sc.close();
	}

}
