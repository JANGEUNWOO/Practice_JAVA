package sec03_verify;

import java.util.Scanner;

public class StringMetodExample {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("문자열 입력 ==>");
		String input=scanner.nextLine();
		
		System.out.println("입력 문자열의 s 와 S를 $로 변환합니다. ");
		
		String output=input.replace("s", "$");
		String output1=output.replace("S", "$");
		System.out.println(output1);
		
		
	}
}
