package sec01_exam_static_instance_class;

public class Nested_Example {
    //인스턴스멤버클래스
	class InstanceClass{
		int iv=100;
		//static int cv=200; //에러? 이유는?
		final static int CONST=100;   //final static 단 상수이므로 허용한다.
		
	}
	//정적멤버클래스
	static class staticInner{
		
		int iv=200;//정적멤버클래스라고 해도 인스턴스 멤버들을 가질수 있다.
		           //하지만 사용하기 위해서는 new로 인스턴스를
		           //생성해야함을 잊지말자.
		
		static int cv=200;
	}
	
	void method() {
		//로컬클래스(매서드 안에 선언, 잠깐 사용할 용도)
		class localclass{
			int iv=300;
			//static int cv=300; //에러? 이유는? 문법자체적으로 허용x
			static final int CONST=300;
		}
		
		//로컬클래스는 해당 메서드 내에서만 사용가능 하다.
		localclass lc=new localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
	}
	
	public static void main(String[] args) {
		Nested_Example ne=new Nested_Example();
		//인스턴스 멤버 클래스는 외부클래스의 인스턴스가 있어야만 사용가능하다.
		InstanceClass ic=ne.new InstanceClass();
		//정적 클래스는 외부클래스의 인스턴스가 없어도 바로 사용가능하다.
		Nested_Example.staticInner si=new staticInner();
		
		System.out.println(ic.iv);
		System.out.println(ic.CONST);
		System.out.println(si.iv);
		System.out.println(staticInner.cv);
		ne.method();
	}
}
