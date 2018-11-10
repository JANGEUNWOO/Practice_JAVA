package sec04_verify;

import java.util.Scanner;

public class StringMetodWithExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 ==> ");//나는 자바를 공부합니다.
		String input=sc.nextLine();
		
		
		System.out.println("입력 문자열의 시작과 끝이 각각 '(' ')'이 아니면, '(' ')'붙여 출력합니다. ");

		if(input.startsWith("(")&&input.endsWith(")")) {
		System.out.println(input);
		}else
		System.out.println("출력 문자열 ==> ("+input+")");
	}

}
