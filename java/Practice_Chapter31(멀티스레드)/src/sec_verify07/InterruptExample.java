package sec_verify07;

public class InterruptExample {

	public static void main(String[] args) {
		
		DrawThread dt1=new DrawThread();
		dt1.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		
		dt1.interrupt();
		
	}

}
