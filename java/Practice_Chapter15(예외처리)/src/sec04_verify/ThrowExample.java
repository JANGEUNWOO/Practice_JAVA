package sec04_verify;

public class ThrowExample {

	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 0;
		
		try {
			int c=a/b;
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("발생 오류 ==> 0으로 나누려고요? 안됩니다.	");
		}

	}

}
