package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		Scanner scanner = new Scanner(System.in);
		
		
		int sum = 0;
		System.out.print("첫번째 정수:");
		int a = scanner.nextInt();
		System.out.print("두번째 정수:");
		int b = scanner.nextInt();

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("[작업처리 결과] :" + sum); // 두정수의 합
		scanner.close();
		return sum;
	}

}
