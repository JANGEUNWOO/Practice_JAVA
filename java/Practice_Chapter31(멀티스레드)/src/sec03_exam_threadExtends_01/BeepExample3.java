package sec03_exam_threadExtends_01;

public class BeepExample3 {

	public static void main(String[] args) {
		//상속을 통한 하위클래스로부터 생성하는 멀티스레드 방법
		//상속을 이용한 다형성 적용됨
		Thread thread = new BeepThread();
		 thread.start(); 
		 
		 // "띵"이라는 문자열 5번 출력
		  for(int i = 0; i<5; i++) {
		         System.out.println("띵");
		         try {
		            Thread.sleep(500);
		         } catch (InterruptedException e) {   }
		  }

	}

}
