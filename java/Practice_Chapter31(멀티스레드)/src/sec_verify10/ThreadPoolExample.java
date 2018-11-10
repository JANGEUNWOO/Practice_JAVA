package sec_verify10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

	public static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		return executorService;
	}

	public static void main(String[] args) {
		GugudanThread GT = new GugudanThread();
		ExecutorService aa=createThreadPool();
		Future<?> future = aa.submit(GT);

		try {
			Object obj = future.get();
			String str = (String) obj;
			System.out.println("[작업처리 완료]");
			
		} 
		catch (InterruptedException e) {e.printStackTrace();} 
		catch (ExecutionException e) {e.printStackTrace();} 
		aa.shutdown();

		
		

	}

}
