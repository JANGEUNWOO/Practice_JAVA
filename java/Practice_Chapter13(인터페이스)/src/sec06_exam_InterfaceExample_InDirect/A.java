package sec06_exam_InterfaceExample_InDirect;



public class A {
	
	public void methodB(I i) {
		
		//클래스 B가 완성이 되지 않아도 선언부 즉 인터페이스에 있는 추상메서드인
		//선언부만 알고 있으면 언제든지 호출이 가능해진다.
		//이것이 간접적 관계인 것이다.
		i.methodB();
	}

}
