package sec12_exam01_thread_wait_notify;

public class WorkObject {

	//synchronized키워드를 붙여주지 않으면, 예외가 발생한다.
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()실행");
		notify(); //wait(일시정지)상태된 스레드를 실행대기 상태로 만든다.
	    
		
		try {
			//자기자신은 일시정지 상태가 된다.
			//(스스로 실행대기 상태로 못감)
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methidB()실행");
		notify(); //wait(일시정지)상태된 스레드를 실행대기 상태로 만든다.
	    
		
		try {
			//자기자신은 일시정지 상태가 된다.
			//(스스로 실행대기 상태로 못감)
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	
}
