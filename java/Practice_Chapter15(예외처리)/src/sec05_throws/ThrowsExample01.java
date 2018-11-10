package sec05_throws;

public class ThrowsExample01 {
	//이렇게 호출하면 누가 예외를 잡아서 처리를 해줘야 하나? 실행순서는 어떻게 되나?
	public static void main(String[] args) {
        
		 try {
	         method1();
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } //같은 클래스 내의 static맴버이므로 객체생성 없이 직접 호출 가능
	   } //메인 메서드의 끝

	
	

	public static void method1() throws Exception{
		method2();
		//method1의 값
	}
	
	public static void method2() throws Exception{
		throw new Exception(); //예외 발생사용
		//method2의 값
	}

}
