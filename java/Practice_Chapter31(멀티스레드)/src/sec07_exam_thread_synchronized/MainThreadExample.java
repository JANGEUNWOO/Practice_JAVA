package sec07_exam_thread_synchronized;

public class MainThreadExample {

	public static void main(String[] args) {

		// 공유객체 생성
		Calculator calculator = new Calculator();

		// 문제가 무엇인가? 출력결과를 보면 user2가 변경한 값으로 다 출력된다.
		// 과연 user1스레드는 원하는 결과값을 얻었는가?
		// 이 문제는 이제 어떻게 해결해야 하나? -> 동기화가 필요하다

		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
