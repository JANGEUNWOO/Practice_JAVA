package sec05_verify;

import java.util.Scanner;

public class StringStackExample {

	public static void main(String[] args) {
		
		
		StringStack stringStack=new StringStack(5);
		Scanner input=new Scanner(System.in);
		
		for(int i=stringStack.length();i>0;i--) {
			System.out.print("�����ϰ� ���� ������ �Է��ϼ���.");
			String inputString=input.nextLine();
			stringStack.push(inputString);
			System.out.println();
		}
		
		System.out.println("������ ���Լ��� �����Դϴ�.(LIFO)");
		System.out.println("���ÿ� �ִ� ������� ����մϴ�.");
		System.out.println();
		
		int j=1;
		for(int i=stringStack.length();i>0;i--) {
			System.out.println(j+"��° ���ؿ� ����� ������ ����մϴ�.");
			System.out.println(stringStack.pop());
			j++;
		}
		
		

	}

}
