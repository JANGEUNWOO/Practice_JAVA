package sec01_verify;

import java.util.Scanner;

public class Exercise5_switch {

	public static void main(String[] args) {
		
		
		int position;
		System.out.print("�˰���� ���� �� �ش������� �Է��ϼ��� :");
		
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
		
		switch (position) {
		case 1:
			System.out.println("�������� 1000����/�� �Դϴ�.");
			break;
		case 2:
			System.out.println("���������� 800����/�� �Դϴ�.");
			break;
		case 3:
			System.out.println("���������� 600����/�� �Դϴ�.");
			break;
		case 4:
			System.out.println("���������� 400����/�� �Դϴ�.");
			break;
		case 5:
			System.out.println("�븮������ 250����/�� �Դϴ�.");
			break;
		case 6:
			System.out.println("��������� 180����/�� �Դϴ�.");
			break;
		

		
		}
        sc.close();
	}

}
