package sec01_verify;

import java.util.Scanner;

public class Exercise5_if {

	public static void main(String[] args) {
		
		
		int position;
		System.out.print("�˰���� ���� �� �ش������� �Է��ϼ��� :");
		
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
		
		if(position==1) {
			System.out.println("�������� 1000����/�� �Դϴ�.");
		} else if(position==2) {
			System.out.println("���������� 800����/�� �Դϴ�.");
		} else if(position==3) {
			System.out.println("���������� 600����/�� �Դϴ�.");
		} else if(position==4) {
			System.out.println("���������� 400����/�� �Դϴ�.");
		} else if(position==5) {
			System.out.println("�븮������ 250����/�� �Դϴ�.");
		} else if(position==6) {
			System.out.println("��������� 180����/�� �Դϴ�.");
		} else {
			System.out.println("�����Դϴ�");
		}
		
		
		sc.close();

	}

}
