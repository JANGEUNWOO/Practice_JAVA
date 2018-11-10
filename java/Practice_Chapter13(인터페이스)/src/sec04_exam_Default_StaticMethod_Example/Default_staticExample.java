package sec04_exam_Default_StaticMethod_Example;

public class Default_staticExample {

	public static void main(String[] args) {
		
		
		Child c=new Child();
		//인스턴스를 생성해야 호출가능한 default메서드 물론,
		//동일한 이름이라면 오버라이딩을 해야한다.
		
		
		c.childmethod();
		c.parentmethod();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		
		//바로 접근 가능한 static메서드
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();

	}

}
