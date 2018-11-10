package sec_verify00;

public class ThreadExample2 {
		
	Thread thread = new TestThread() {
		@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i+ " 번째 Test스레드의 실행내용입니다.");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e){}
				}
				System.out.println("Test스레드가 종료됩니다.");
			}
	};
		
}

