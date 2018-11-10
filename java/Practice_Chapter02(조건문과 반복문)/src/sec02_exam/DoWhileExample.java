package sec02_exam;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		String inputString=null;
		//do-while문은 최소 한번은 무조건 실행한다. 이유는 조건이 뒤에 있기 때문
		//while과의 차이점
		do {
			System.out.print(">");
			//Scanner클래스의 nextLine()은 엔터칠떄까지 공백포함하여 String으로 리턴
			//next()는 공백 만날 때까지만 리턴
			inputString=sc.nextLine().trim();
			System.out.println(inputString);
		} while(!inputString.equals("q")); //q를 입력하면 조건이 false이므로 루프 빠져나감
		
		System.out.println();
		System.err.println("프로그램 종료");
		sc.close();

	}

}
