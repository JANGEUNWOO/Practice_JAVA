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
			System.out.println("���� �� >> i�� ��ȭ :" + i);
			i += 1;
		}
		System.out.println("���� ����");

	}
}
