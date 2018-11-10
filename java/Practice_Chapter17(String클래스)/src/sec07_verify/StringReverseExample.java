package sec07_verify;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		
		//나는 자바를 사랑합니다.입력
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input=sc.nextLine();
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(input);
		
		System.out.println(strBuffer.reverse());
		

	}
}
