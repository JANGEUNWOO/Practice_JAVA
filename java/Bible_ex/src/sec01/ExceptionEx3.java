package sec01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var=50;
		try {
			System.out.println("���� �Է�:");
			int data=new Scanner(System.in).nextInt();
			
			System.out.println(var/data);
		}catch(InputMismatchException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}
		System.out.println("���α׷� ����");

	}

}
