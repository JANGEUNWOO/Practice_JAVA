package sec08_exam_thread_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// 20��� ����, ���� �����̰ų� ���� ���(RUNNABLE)�����̴�
		for (long i = 0; i < 2000000000; i++) {
		}

		// �Ͻ� ����(TIME_WAITING)����

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// 20 ��� ����, ��������̰ų� ���� ���(RUNNABLE)�����̴�.
		for (long i = 0; i < 2000000000; i++) {
		}
	}// ����(TERMINATED)
}