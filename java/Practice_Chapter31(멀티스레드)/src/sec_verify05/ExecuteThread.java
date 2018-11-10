package sec_verify05;

public class ExecuteThread extends Thread {

	private boolean stop;
	int i = 1;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while (!stop) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println("실행 중 >> i값 변화 :" + i);
			i += 1;
		}
		System.out.println("실행 종료");

	}
}
