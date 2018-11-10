package sec17.exam04_thread_pool_external_object;

public class Result {

	int accumValue;

	// 공유객체이기 떄문 즉, 여러 스레드가 접근하여 사용할 수 있으므로
	// 동기화가 필수적

	public synchronized void addValue(int value) {
		this.accumValue += value;
	}

	public synchronized int getValue() {
		return this.accumValue;
	}
}
