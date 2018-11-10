package sec_verify02;

public class YourThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){}
		for(int i =0; i<5; i++) {
			System.out.println(this.getName());
		}
	}

	public String getName() {
		return "YourThread";
	}
}
