package sec02_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		
		
		
		System.out.print("1���� �迭�� ����ϴ�. �迭���� �Է�:");
		//Call by reference ������ ����!!
		//�迭���� �ּ� .. ���� ����..
		//�⺻�� �Ű����� ������ �Ű����� ���� ȭ����!!!
		
		Scanner sc=new Scanner(System.in);
		int ab=sc.nextInt();
		int[] values=new int[ab];
		
		
		Computer com=new Computer();
		System.out.println("�ش� �迭 �濡 ������ �Է��ϼ���.");
		System.out.println("Computer�ν��Ͻ� ����޼��� sum�� ȣ���� �����"+com.sum1(values)+"�Դϴ�.");
		
		
		

	}

}
