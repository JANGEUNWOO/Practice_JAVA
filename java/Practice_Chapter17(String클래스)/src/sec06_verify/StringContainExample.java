package sec06_verify;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 문장을 입력해보세요 :");
		String input1=sc.nextLine();
		System.out.print("두 번째 문장을 입력해보세요 :");
		String input2=sc.nextLine();
		
		
		
	    
		System.out.println("문자열1 ==> ["+input1+"]");
		System.out.println("문자열2 ==> ["+input2+"]");
		
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("입력한 두 문장은 같은 문장이네요.");
		}
		
		if((input1.indexOf("java")!=-1&&input2.indexOf("java")!=-1)) {
			System.out.println("입력한 두 문장에는 Java가 포함되어있네요.");
		}

	}

}
