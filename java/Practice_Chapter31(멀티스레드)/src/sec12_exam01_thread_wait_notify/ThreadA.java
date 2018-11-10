package sec12_exam01_thread_wait_notify;

public class ThreadA extends Thread {

	// 공유객체 선언
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}

	}

}
