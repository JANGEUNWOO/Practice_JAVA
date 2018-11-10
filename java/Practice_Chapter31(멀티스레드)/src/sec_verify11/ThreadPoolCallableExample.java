package sec_verify11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableExample {

	public static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		return executorService;

	}

	public static void main(String[] args) {

		SumThread ss = new SumThread();
		ExecutorService a = createThreadPool();

		Future<Integer> future = a.submit(ss);

		try {
			int result = future.get();
			System.out.println("[�۾�ó�� ��� ]:" + result);
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (Exception e) {
		}

		a.shutdown();

	}

}
