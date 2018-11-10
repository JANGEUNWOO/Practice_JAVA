package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup tg, String threadname) {
		super(tg, threadname);
	}

	public void run() {
		ThreadGroup maingroup = Thread.currentThread().getThreadGroup();
		String str = maingroup.getName();
		System.out.println("현재 실행 중인 스레드명 : " + Thread.currentThread().getName() + "스레드그룹명 :" + str + "부모그룹명 : "
				+ maingroup.getParent().getName());
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupted!!");
				break;
			}

		}
		System.out.println(this.getName() + "종료됨!");
	}

}
