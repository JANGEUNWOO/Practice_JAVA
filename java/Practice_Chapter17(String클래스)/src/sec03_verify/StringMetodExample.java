package sec03_verify;

import java.util.Scanner;

public class StringMetodExample {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("���ڿ� �Է� ==>");
		String input=scanner.nextLine();
		
		System.out.println("�Է� ���ڿ��� s �� S�� $�� ��ȯ�մϴ�. ");
		
		String output=input.replace("s", "$");
		String output1=output.replace("S", "$");
		System.out.println(output1);
		
		
	}
}
