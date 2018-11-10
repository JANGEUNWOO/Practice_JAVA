package sec12_exam02_thread_wait_notify;

public class ConsumerThread extends Thread {
	// 공유객체 DataBox
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData(); // 저장된 데이터를 가져온다.
		}
	}
}
