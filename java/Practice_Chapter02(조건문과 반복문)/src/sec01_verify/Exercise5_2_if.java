package sec01_verify;

import java.util.Scanner;

public class Exercise5_2_if {

	public static void main(String[] args) {
		
		char gender;
		String regNo="";
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222) : ");
		
		Scanner sc=new Scanner(System.in);
		regNo=sc.nextLine();
		
		gender=regNo.charAt(7);
		
		if((gender=='1')||(gender=='3')) {
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
		} else if((gender=='2')||(gender=='4')) {
			System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
		}
      sc.close();
	}

}
