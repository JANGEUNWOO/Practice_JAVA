package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		Scanner scanner = new Scanner(System.in);
		
		
		int sum = 0;
		System.out.print("ù��° ����:");
		int a = scanner.nextInt();
		System.out.print("�ι�° ����:");
		int b = scanner.nextInt();

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("[�۾�ó�� ���] :" + sum); // �������� ��
		scanner.close();
		return sum;
	}

}
