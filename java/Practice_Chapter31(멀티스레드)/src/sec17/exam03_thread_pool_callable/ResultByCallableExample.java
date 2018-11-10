package sec17.exam03_thread_pool_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {

		// �ش� pc cpu�� �ھ���� �ִ� ������ ���� �ش�.(ex.����ھ�� Z. �����ھ�� 4�̴�)
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("������ ����:" + Runtime.getRuntime().availableProcessors());

		// Callable �͸� ������ü ����(�۾���ü)==>
		// ���ϰ��� <T>Ÿ������ �����Ѵ�. �Ͽ�. ���ϰ��� <T>Ÿ�԰� �����ؾ��Ѵ�

		System.out.println("[�۾�ó�� ��û]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};

		/*
		 * �۾�ť�� �۾��� �ִ´�. ���ϰ���<T> �Ͽ� Future<T> submit(Callable task)�� �����Ѵ�. �۾��� �Ϸ�ɋ�����
		 * ���ŷ �� ��ٸ���. Future�� �����Ϸᰴü�̴�. Futrue���� <T>Ÿ������ �����ؾ� �Ѵ�.
		 */
		
		Future<Integer> future = executorService.submit(callable);
		try {
			System.out.println("���ŷ ����"+System.nanoTime());
			int value = future.get(); //get()�� �۾���ü�� �۾��� �Ϸ��� ������ ��ٸ���(���ŷ)
			System.out.println("���ŷ ��"+System.nanoTime());
			System.out.println("[�۾�ó�� ���]:" + value);
			System.out.println("[�۾�ó�� �Ϸ�]");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (ExecutionException e) {

			e.printStackTrace();
		}
		executorService.shutdown(); // �����带 ����

	}

}
