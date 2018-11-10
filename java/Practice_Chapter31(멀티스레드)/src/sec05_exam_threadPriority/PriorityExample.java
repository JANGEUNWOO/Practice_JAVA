package sec05_exam_threadPriority;

public class PriorityExample {

	public static void main(String[] args) {
		  for (int i = 1; i <= 10; i++) {
		         Thread thread = new CalcThread("Thread:" + i);

		         // 1~9까지의 스레드
		         if (i != 10) {
		            thread.setPriority(Thread.MIN_PRIORITY); // 우선순위 1지정
		            // thread.setPriority(1); //우선순위 1지정
		         } else {
		            thread.setPriority(Thread.MAX_PRIORITY); // 우선순위 10지정
		            // thrad.setPriority(10); //우선순위 10지정
		         }
		         thread.start();
		      }

		   }
		   /*
		    * 아무리 우선순위를 10으로 주었다 하나, 미치는 빈도가 높을뿐이지 꼭 먼저 작업을 끝낸다고는 보장못한다. 어차피 자바는 순환할당방식을
		    * 실행하므로 CPU의 상태에 따라 달라진다.
		    */

}