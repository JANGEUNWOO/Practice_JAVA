package sec07_exam_thread_synchronized;

public class User1 extends Thread {
	// 공유객체 선언
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-1");// 스레드 이름 설정
	}

	@Override
	public void run() {
		// 공유객체의 필드인 memory값을 100으로 설정하고 있따.
		this.calculator.setMemory(100);
	}

}
