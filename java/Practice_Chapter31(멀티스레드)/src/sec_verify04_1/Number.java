package sec_verify04_1;

public class Number {
	int num = 0;

	public synchronized void addNum() {

		System.out.println("1~1000������ ���� ���սô�.");
		for (int i = 0; i <= 1000; i++) {
			num += i;
		}
		System.out.println(Thread.currentThread().getName()+ "�� ���:" + num);
	}
	
}
