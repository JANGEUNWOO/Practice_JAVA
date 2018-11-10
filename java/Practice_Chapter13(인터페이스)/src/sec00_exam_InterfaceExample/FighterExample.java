package sec00_exam_InterfaceExample;

public class FighterExample {

	public static void main(String[] args) {
	
		//Fightable f=new Fightable();
		//Unit f=new Fighter();     //계층도 그려보기
		Fighter f= new Fighter();
		
		/*A instanceof B 란: A가 B타입일 경우 true를 반환한다.
		즉, A가 B로 형변환된다는 의미이다.(조상클래스란 말이다.)
		다형성의 개념을 떠올려 보자.(조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있는 것.)*/
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Moveable인터페이스를 구현했습니다.");
			
		}
		if(f instanceof Moveable) {
			System.out.println("f는 Moveable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
			
		}
		//재정의된 추상매서드 호출
		f.move(0, 0);
		f.attack(null);
		
	}

}
