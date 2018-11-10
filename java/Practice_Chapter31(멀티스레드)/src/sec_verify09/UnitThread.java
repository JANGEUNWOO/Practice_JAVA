package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup tg, String threadname) {
		super(tg, threadname);
	}

	public void run() {
		ThreadGroup maingroup = Thread.currentThread().getThreadGroup();
		String str = maingroup.getName();
		System.out.println("���� ���� ���� ������� : " + Thread.currentThread().getName() + "������׷�� :" + str + "�θ�׷�� : "
				+ maingroup.getParent().getName());
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupted!!");
				break;
			}

		}
		System.out.println(this.getName() + "�����!");
	}

}
