package sec04_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r;
		Scanner scanner=new Scanner(System.in);
		System.out.print("���ϰ����ϴ� ���� �������� �Է��ϼ��� : ");
		r=scanner.nextInt();
		
		Calculator cr=new Calculator();
		System.out.println("Calculator ��ü�� areaCircle()����");
		System.out.println("��������:"+cr.areaCircle(r));
		System.out.println();
		
		
		Computer c=new Computer();
		System.out.println("Computer ��ü�� areaCircle()����");
		System.out.println("��������:"+c.areaCircle(r));
		
		
		double pp=3.145648393;
		System.out.printf("%.3f",pp);

		scanner.close();

	}

}
