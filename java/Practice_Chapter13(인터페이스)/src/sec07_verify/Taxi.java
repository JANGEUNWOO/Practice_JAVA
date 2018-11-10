package sec07_verify;

public class Taxi implements Vehicle {

	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void stop() {
        System.out.println("택시가 멈춥니다.");
	}
}
