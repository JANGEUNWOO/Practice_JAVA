package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {

	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("[������ �۾���û]");
		try {
		System.out.print("���ϴ� ������ ���� �Է��ϼ���:");
		int a = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
		}catch(Exception e) {
			System.exit(0);
			sc.close();
		}
		System.out.println("[������ �۾� �Ϸ�]");

	}

}
