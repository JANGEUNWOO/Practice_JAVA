package sec05_verify;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("원하는 문장을 입력해보세요:");
		String input=sc.nextLine();
		System.out.println("입력한 문자열 : ["+input+"]");
		input=input.replaceAll("\\p{Z}","");
		System.out.println("공백제거를 한 문자열 : ["+input+"]");
		

	}

}
