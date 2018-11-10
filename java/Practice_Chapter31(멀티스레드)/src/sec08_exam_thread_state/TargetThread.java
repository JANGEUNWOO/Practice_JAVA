package sec08_exam_thread_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// 20억번 루핑, 실행 상태이거나 실행 대기(RUNNABLE)상태이다
		for (long i = 0; i < 2000000000; i++) {
		}

		// 일시 정지(TIME_WAITING)상태

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		// 20 억번 루핑, 실행상태이거나 실행 대기(RUNNABLE)상태이다.
		for (long i = 0; i < 2000000000; i++) {
		}
	}// 종료(TERMINATED)
}