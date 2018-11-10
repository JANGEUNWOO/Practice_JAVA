package sec03_verify;

public class Car {

	int Speed;
	
	
	final void speedUp() {
		Speed+=10;
		System.out.println("현재 스포츠카의 속도는 "+Speed+"km입니다.");
	}
	
	void speedDown() {
		
		Speed-=10;
		System.out.println("현재 스포츠카의 속도는"+Speed+"km입니다.");
		
	}
	
	void stop() {
		System.out.println("차를 멈춥니다.");
	}
	
	
	
}
