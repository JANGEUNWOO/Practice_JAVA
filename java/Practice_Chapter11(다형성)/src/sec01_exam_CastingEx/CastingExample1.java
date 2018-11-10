package sec01_exam_CastingEx;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe;   //car=(car)fe;에서 형변환이 생략된 형태다.(다형성)
		//car.water(); <--컴파일 에러발생 이유는 Car의 근본에 water가 없음.
		fe2=(FireEngine)car; //자손타입<-- 조상타입
		fe2.water();
		
		
	}
	
}
