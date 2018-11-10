package sec01_verify;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.method1();
		p.method2();
		
		Child c=new Child();
		c.method1();
		c.method2();  //자손클래스에서 메서드2 오버라이딩 한 값이 출력
		c.method3();
		
		Parent z=new Child();
		z.method1(); //조상클래스 메서드1 출력
		z.method2(); //오버라이딩한 자손클래스 메서드2 출력
		//z.method3(); //자손클래스 매서드3 출력 오류> 근본이 다른 Parent에서 메소드3을 출력하려니 오류걸림 

		
	}

}
