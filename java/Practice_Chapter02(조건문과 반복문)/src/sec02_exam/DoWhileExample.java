package sec02_exam;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		String inputString=null;
		//do-while���� �ּ� �ѹ��� ������ �����Ѵ�. ������ ������ �ڿ� �ֱ� ����
		//while���� ������
		do {
			System.out.print(">");
			//ScannerŬ������ nextLine()�� ����ĥ������ ���������Ͽ� String���� ����
			//next()�� ���� ���� �������� ����
			inputString=sc.nextLine().trim();
			System.out.println(inputString);
		} while(!inputString.equals("q")); //q�� �Է��ϸ� ������ false�̹Ƿ� ���� ��������
		
		System.out.println();
		System.err.println("���α׷� ����");
		sc.close();

	}

}
