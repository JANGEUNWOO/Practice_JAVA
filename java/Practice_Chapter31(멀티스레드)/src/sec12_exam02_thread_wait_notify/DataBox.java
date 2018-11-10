package sec12_exam02_thread_wait_notify;

public class DataBox {

	private String data;
	/*
	 * 아래 getData()는 ConsumerThread가 data를 읽어가도록 되어있다. 그래서 null이면 wait(일시정지:
	 * blocked상태)하고 ,null이 라니라면 ConsumerThread가 읽은 데이터를 출력하며서, 다른 waiting긴 스레드를를
	 * notify를 통해서 실행대기상태로 바꾼다.
	 * 
	 */

	public synchronized String getData() {
		// 읽어올 데이터가 없다면...
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}

		}
		String returnValue = this.data;
		System.out.println("ConsummerThread가 읽은 데이터:" + returnValue);
		// 다른스레드(생산자 스레드)를 깨운다(즉 실행대기상태(Runnable)로 만든다)
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// ConsumerThread가 데이터를 읽지 않았다면...(ctrl+1)누르면 단축키)
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}

		}
		this.data = data;// 필드에 값을 저장하고
		System.out.println("ProducerThread가 생성한 데이터:" + this.data);
		notify();
	}
	
	/*
	 * 결과론적으로 wait()와 notify()를 이용하여 번갈아 데이터
	 * 즉 공유객체에 접근하기 위해서는 synchornized란 동기화 키워드가
	 * 필히 들어가야 예외도 발생하지 아니하고, 데이터의 정확성도 보장가능
	 * 즉, 객체잠금이 되어야 한다는 것.
	 */

}
