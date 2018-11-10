package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {

	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("[구구단 작업요청]");
		try {
		System.out.print("원하는 구구단 수를 입력하세요:");
		int a = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
		}catch(Exception e) {
			System.exit(0);
			sc.close();
		}
		System.out.println("[구구단 작업 완료]");

	}

}
