package sec06_exam_InterfaceExample_InDirect;

public class B implements I {

	
	@Override
	public void methodB() {
		System.out.println("직접적 관계인 클래스 A를 통한 MethodB()");
	}
}
