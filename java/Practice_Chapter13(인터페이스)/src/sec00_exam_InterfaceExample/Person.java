package sec00_exam_InterfaceExample;
//Person클래스가 인터페이스 A를 구현했다.
public class Person implements A {
	//인터페이스 A에 선언되어있는 추상메서드 method()오버라이딩
	@Override
	public void method() {
		System.out.println("인터페이스를 구현한 클래스 Person입니다!");
		
	}
    
	//Person클래스만이 지니는 멤버메서드
	public void method2() {
		System.out.println("인터페이스를 구현한 클래스에서 새로 만든 메서드입니다!");
	}

}
