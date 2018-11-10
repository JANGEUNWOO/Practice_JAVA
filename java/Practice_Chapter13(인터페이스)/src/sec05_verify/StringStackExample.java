package sec05_verify;

import java.util.Scanner;

public class StringStackExample {

	public static void main(String[] args) {
		
		
		StringStack stringStack=new StringStack(5);
		Scanner input=new Scanner(System.in);
		
		for(int i=stringStack.length();i>0;i--) {
			System.out.print("저장하고 싶은 문장을 입력하세요.");
			String inputString=input.nextLine();
			stringStack.push(inputString);
			System.out.println();
		}
		
		System.out.println("스택은 후입선출 개념입니다.(LIFO)");
		System.out.println("스택에 있는 문장들을 출력합니다.");
		System.out.println();
		
		int j=1;
		for(int i=stringStack.length();i>0;i--) {
			System.out.println(j+"번째 스텍에 저장된 문장을 출력합니다.");
			System.out.println(stringStack.pop());
			j++;
		}
		
		

	}

}
