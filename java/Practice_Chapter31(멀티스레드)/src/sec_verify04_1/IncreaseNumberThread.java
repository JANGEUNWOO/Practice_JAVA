package sec_verify04_1;

public class IncreaseNumberThread extends Thread {

	private Number number;

	public IncreaseNumberThread(Number number) {
		this.number = number;
	}

	@Override
	public void run() {

		number.addNum();
	}
	
	

}
