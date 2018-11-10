package sec07_exam_annoymousImplements;

public class ActionExample {

	public static void main(String[] args) {
		//여기서()는 익명구현클래스의 생성자를 의미한다. 인터페이스는 생성자가 없다.
		//멤버변수의 초기값 대입된 형태
		
		Action action=new Action() {
			//이영역은 접근불가 나가는것도 불가...
			int a=10;
			//익명구현클래스, 1회성 사용 용도로 거의 사용한다.
			//특히 UI이벤트처리나 안드로이드프로그래밍에서 자주 등장한다.
			public void method() {
				System.out.println("익명구현객체 자체 메서드, 멤버변수 값:"+this.a);
			}
			
			@Override
			public void work(int a) {
				this.method();
				System.out.println(a+"복사를 합니다.");
			}
			
		};
		
		//action.method();
		action.work(100);


	}

}
