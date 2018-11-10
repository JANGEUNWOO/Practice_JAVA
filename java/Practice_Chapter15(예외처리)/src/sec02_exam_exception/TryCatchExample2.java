package sec02_exam_exception;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는 이유?
			
		}
		catch(Exception e) {
			System.out.println(5); //실행되는 이유?
			//예외 이유를 말해준다.
			System.out.println("예외 발생:"+e.toString());
		}
		System.out.println(6);
	}

}
