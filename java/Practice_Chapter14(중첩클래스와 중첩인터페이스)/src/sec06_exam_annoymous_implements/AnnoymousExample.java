package sec06_exam_annoymous_implements;

public class AnnoymousExample {

	public static void main(String[] args) {
		
		
		//Annoymous의 인스턴스 생성
		Annoymous annoy=new Annoymous();
		
		//annoy인스턴스에 있는 익명구현객체에 오버라이딩 메서드 호출
		annoy.field.turnOn();
		annoy.field.turnOff();
		annoy.method1();
		
		//매개값으로 인터페이스타입이 들어ㅘ서 바로 익명구현개체를 생성해여 대입
		annoy.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 Tv를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 Tv를 끕니다.");
				
			}
		});

	}

}
