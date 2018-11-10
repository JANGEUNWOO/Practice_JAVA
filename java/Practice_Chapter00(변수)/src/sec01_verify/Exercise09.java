package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("초를 입력하세요 : ");
	
		time=sc.nextInt();
		
		second=time%60;
		minute=(time/60)%60;
		hour=((time/60)/60);
		
		
		
		
		System.out.print(time + "초는 "+hour + "시간, "+minute + "분, "+second + "초입니다.");
		
		sc.close();
	}

}
