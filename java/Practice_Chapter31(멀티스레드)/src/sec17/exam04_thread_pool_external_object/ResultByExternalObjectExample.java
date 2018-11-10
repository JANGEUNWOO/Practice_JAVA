package sec17.exam04_thread_pool_external_object;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalObjectExample {

	public static void main(String[] args) {
		// 해당 PC CPU의 코어수를 최대 스레드 수로 준다.(ex.듀얼코어는 2, 쿼드코어는 4이다)
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업처리 요청]");

		// 내부 클래스
		class Task implements Runnable {
			// 외부 객체의 참조를 얻기 위해 선언
			Result result;

			// 생성자
			public Task(Result result) {
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++)
					sum += i;

				// 스레드에 의해서 계산되어진 값이 외부객체인 result의
				// addValue()를 호출하여 acculValue에 누적된다.
				result.addValue(sum); // 객체잠금??
				System.out.println(
						"현재 실행 스레드 이름 : " + Thread.currentThread().getName() + "\n작업한 결과 : " + result.getValue());
				System.out.println(Thread.currentThread().getName());
			}
		}
		Result result = new Result(); // 공유 객체의 생성
		// 작업 객체 생성(같은 객체)
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		// 작업 요청(큐에 넣는다)
		Future<Result> future1 = executorService.submit(task1, result);
		try {
			result = future1.get();
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		} catch (ExecutionException e1) {

			e1.printStackTrace();
		}

		Future<Result> future2 = executorService.submit(task2, result);
		// Future<Result> future3 = executorService.submit(task1, result);
		// 아래의 get()메서드를 하나라도 처리를 해주지 않으면 올바른 결과가 나오지 아니한다.
		// 즉, 스레드의 처리통보(블로킹)를 받아야 비로소 온전한 결과를 얻을수가 있다.
		try {
			// task1에 대한 결과
			result = future2.get(); // task2에 대한 결과
			// result = future3.get(); //task1에 대한 결과
			System.out.println("[작업처리 결과 : " + result.accumValue + "]");
			System.out.println("[작업처리 완료]");
		} catch (Exception e) {
			e.getMessage();
		}

		System.out.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName() + "\n작업한 결과 : " + result.getValue());

		executorService.shutdown(); // 스레드풀 종료
	}
}
