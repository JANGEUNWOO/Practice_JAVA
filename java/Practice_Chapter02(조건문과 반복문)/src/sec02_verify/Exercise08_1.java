package sec02_verify;

import java.util.Scanner;

public class Exercise08_1 {

	public static void main(String[] args) {
		
		
		int num;
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��Ͻÿ�:");
		num=sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��Ͻÿ�:");
		num1=sc.nextInt();
		
		System.out.println(num+"��"+num1+"���� 3�� 4�� ������ ���");
		
		for(int i=num; i<=num1; i++) {
			if(i%3==0||i%4==0) {
				continue;
			}
			System.out.println();
		}
         sc.close();
	}

}
