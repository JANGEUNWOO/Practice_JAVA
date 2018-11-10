package sec03_verify;

public class SportsCar extends Car {

	int getSpeed() {
		System.out.println("현재 스포츠카의 속도는 "+Speed+"km입니다.");
		return Speed;
	}
	
	void stop() {
	super.stop();
	System.out.println("스포츠카를 멉춥니다.");	
    }
	
	
	
}
