package sec17.exam01_thread_pool_submit_execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample {

	public static void main(String[] args) {
		// �ִ� 2���� �����带 ������ ������Ǯ ����
		ExecutorService excutorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 20; i++) {
			// 20���� �۾���ü ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// newFixedThreadPool�� newCachedThreadPool�� ���������� ThreadPoolExecutor��
					// ����� ���� ������ Ÿ�Ժ�ȯ���� ThreadPoolExecutor ��ü�� ���� �� �ִ�.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) excutorService;
					// ���� ������Ǯ�� �ִ� ������ ������ �����Ͽ� ���� �� �ִ�.
					int poolSize = threadPoolExecutor.getPoolSize();

					// �۾������ϴ� ��������� ��´�.
					String threadName = Thread.currentThread().getName();
					// System.out.printlnI("�۾�ó��threadName);
					System.out.println("[�� �����尳��:" + poolSize + "] �۾������� �̸�:" + threadName);
					// �Ϻη� ���ܸ� �߻����Ѽ� execute()�� submit()�� ���̸� ����.

					int value = Integer.parseInt("��");

				}
			};
			// �۾�ť�� runnable��ü�� �ִ� ����, execute()�� �۾� ó�� ���߿� ���ܰ� �߻��ϸ�,
			// �ش� �����带 �����ϰ� ���ο� �����带 �����Ѵ�. submit()�� ���ܰ� �߻��ϴ���,
			// �ش� �����带 �������� �ʰ� ������ �Ѵ�. �Ͽ�, submit()�� ����ϴ� ���� ����.
			// excutorService.execute(runnable);
			 excutorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}

		}
		// ������Ǯ�� �����Ŵ.(��, �۾�ť�� �ִ� ��� �۾��� ó���� �Ŀ� ������ Ǯ�� �����Ų��,)
		excutorService.shutdown();

	}

}
