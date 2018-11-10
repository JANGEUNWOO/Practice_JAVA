package sec12_exam02_thread_wait_notify;

public class WaitNotifyExmaple {

	public static void main(String[] args) {

		DataBox dataBox = new DataBox();

		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);

		producerThread.start();
		consumerThread.start();

	}

}
