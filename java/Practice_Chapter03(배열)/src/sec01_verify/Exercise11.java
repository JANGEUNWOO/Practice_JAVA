package sec01_verify;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		
		String[] str = new String[]{"가위","바위","보"};
		System.out.println(Arrays.toString(str)+"를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String user, comp;
		
		
		int i=0;
		
		
		while(i<3) {
		   System.out.print("입력");
		   user=sc.nextLine();
		   
		   if(user.equals("그만")) {
			   System.out.println("프로그램을 종료합니다.");
			   break;
		   
		   }
			
		}
		
		sc.close();
	}

}
