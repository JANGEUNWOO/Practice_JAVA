package sec01_verify;

import java.util.Scanner;

public class Exercise5_2_switch {

	public static void main(String[] args) {
		
		
		char gender;
		String regNo="";
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222) : ");
		
		Scanner sc=new Scanner(System.in);
		regNo=sc.nextLine();
		
		gender=regNo.charAt(7);
		
		switch(gender) {
		case '1':
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		case '3':
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		case '2':
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		case '4':
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			break;
		
		}
		
       sc.close();
	}

}
