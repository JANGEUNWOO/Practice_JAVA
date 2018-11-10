package sec04_throw;

public class ThrowExample1 {

	public static void main(String[] args) {
		
		
		try {
			throw new Exception("고의로 발생시켰음.");
		}
		//Exception클래스는 모든예외의 조상이므로 어떤 예외도 다 받을 수 있다
		catch(Exception e) {
			//간단히 출력
			System.out.println("에러 메세지:"+e.getMessage());
			//스택 메모리에 있는 내용까지 출력(개발용)
			e.printStackTrace();   //예외 발생 경로는 추적
		}
		System.out.println("프로그램이 정상 종료되었음.");

	}

}
