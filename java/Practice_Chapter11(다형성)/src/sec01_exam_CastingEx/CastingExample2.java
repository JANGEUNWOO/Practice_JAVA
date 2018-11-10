package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {
		
		Car car=new Car();  //Car인스턴스 생성   Car생성자 FireEngine으로 바꾸면 예외풀림
		//Car car=null;    //Car인스턴스 생성
		
		//조상타입의 인스턴스를 가지고 자손타입의 인스턴스를 다룰수 있다.
		//(리모컨의 기능이 多--->小로는 가능), 반대는불가능
		//ㅓCar car=new FireEngine();   //이런식으로 가능함.
		
		//Car2는 null초기화
		Car car2=null;
		FireEngine fe=new FireEngine();  //fe도 null초기화
		
		//Car에 drive()매서드 호출
		
		car.drive();   //출력됨
		//자손타입의 인스턴스를 가지고 조상타입의 인스턴스를 다룰수 없다.
		//(리모컨의 기능이 小-->多로는 불가).
		//반대는 허용
		//car=fe;
		fe=(FireEngine)car; //컴파일은 ok, 실행시 에러가 발생(ClassCastException발생) 왜??>>
		fe.drive();   //주석처리하면 출력됨
		car2=fe;
		car2.drive(); //주석처리하면 출력됨
		fe.water();   //주석처리하면 출력됨
		
	}

}
