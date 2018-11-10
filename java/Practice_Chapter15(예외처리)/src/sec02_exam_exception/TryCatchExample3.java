package sec02_exam_exception;

public class TryCatchExample3 {

	public static void main(String[] args) {
		
		
		//Class클래스는 묹열을 가지고 클래스로 만들어서 변환해준다.
		//인스턴스를 사용할 수 있지만, 반환된 인스턴스의 정보만 알 뿐이다.
		//하지만, 문자열에 해당하는 클래스가 없다면 일반 예외가 발생한다.
		//그래서 컴파일이 되지 않는다. 즉 다시말해 예외처리가 필수적이다.
		try {
			Class clazz=Class.forName("java.lang.String2");
			//Class clazz=Class.forname("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}
		//예외는 발생했으나 정상종료 됨을 알수가 있다.
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		//항상 실행한다.
		finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
