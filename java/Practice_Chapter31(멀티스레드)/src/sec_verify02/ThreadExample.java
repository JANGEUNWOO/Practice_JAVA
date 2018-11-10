package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {
		
		MyThread my = new MyThread();
		YourThread your = new YourThread();
		Thread yourt = new Thread(your);
		my.start();
		yourt.start();
	}
}