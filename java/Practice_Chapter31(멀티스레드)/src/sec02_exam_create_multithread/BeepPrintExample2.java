package sec02_exam_create_multithread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
	      // 직접 생성하는 멀티스레드로 하는 3가지 방법
	      // 방법1 --> 직접 생성
	      Runnable beepTask = new BeepTask();    //인터페이스의 다형성
	      Thread thread = new Thread(beepTask);
	      
	      // 방법2 --> 익명 구현 클래스 이용
	      /*Thread thread = new Thread(new Runnable() {
	         
	         @Override
	         public void run() {
	            //비프음을 5번 소리나게 함.
	            Toolkit toolkit = Toolkit.getDefaultToolkit();
	            for(int i = 0; i<5; i++) {
	               toolkit.beep();
	               try {
	                  Thread.sleep(500);
	               } catch (InterruptedException e) {}
	            }
	         }
	      });*/
	      
	      // 방법 3 --> 람다식(함수적 인터페이스) 이용하여 초간단화 ()는 run메서드의 매개변수를 
	      // 의미하는데 매개변수가 1개도 없다는 것을 의미한다. run()의 실행블럭을 의미함.
	      // 람다식은 1.8부터 등장했는데 나중에 배우게 된다.
	      /*Thread thread = new Thread( ()-> {
	         //비프음 5번 소리나게 함.
	         Toolkit toolkit = Toolkit.getDefaultToolkit();
	         for(int i = 0; i<5; i++) {
	            toolkit.beep();
	            try {
	               Thread.sleep(500);
	            } catch (InterruptedException e) {}
	      }
	   });*/
	      //Thread thread = new Thread(new BeepTask());
	      thread.start();         // run()을 main스레드가 실행하라고 지시함. 이때부터 main스레드와
	                        // beepTask스레드가 동시에 실행됨. beep음 5번 실행
	      
	      //아래는 메인스레드가 실행할 부분
	      for(int i = 0; i<5; i++) {
	         System.out.println("띵");
	         try {
	            Thread.sleep(500);
	         } catch (InterruptedException e) {   }
	      }
	   }
}
