package sec_verify00;

public class ThreadExample2 {
		
	Thread thread = new TestThread() {
		@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i+ " ��° Test�������� ���೻���Դϴ�.");
					try {
						Thread.sleep(500);
					}catch (InterruptedException e){}
				}
				System.out.println("Test�����尡 ����˴ϴ�.");
			}
	};
		
}

