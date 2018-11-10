package sec_verify05;

import java.util.Scanner;

public class StopFlagExample {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.print("몇 초후 종료할까요>>");
		int z=sc.nextInt();
		System.out.println(z+"초 후에 종료됩니다.");
		ExecuteThread p1 = new ExecuteThread();
		p1.start();

		try {
			Thread.sleep(z*1000);
		} catch (InterruptedException e) {
		}
        p1.setStop(true);
	}

}
