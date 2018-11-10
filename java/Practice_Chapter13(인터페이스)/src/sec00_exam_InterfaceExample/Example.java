package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {
		
		
		//인터페이스를 구현했다는라는 것은 구현클래스의 일종의 조상을 의미한다.
		//그래서 다형성이 적용
		
		A a=new Person();
		Person p=new Person();
		a.method();
		//a.method2();  //근본이 다름...
		p.method();
		
		A a1=new Member();  //인터페이스 필드의 다형성이 적용
		a1.method();
	}

}
