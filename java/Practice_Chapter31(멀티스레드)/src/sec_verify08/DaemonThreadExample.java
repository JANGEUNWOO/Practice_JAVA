package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {

		DateTimeThread dt1 = new DateTimeThread();
		dt1.setDaemon(true);
		dt1.start();

		if (dt1.isDaemon())

			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {

			}
		System.out.println("데몬 스레드인 dateTimeThread가 종료됩니다.");
		System.out.println("메인스레드가 종료됩니다.");

	}

}
