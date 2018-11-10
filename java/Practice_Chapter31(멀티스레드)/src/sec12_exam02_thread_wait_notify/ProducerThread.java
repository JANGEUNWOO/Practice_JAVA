package sec12_exam02_thread_wait_notify;

public class ProducerThread extends Thread {
	// °øÀ¯°´Ã¼ DataBox
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data" + i;
			dataBox.setData(data);
		}
	}
}
