package sec_verify02;

public class MyThread extends Thread {

	public MyThread() {
		this.setName("MyThread");  //������ �̸� ����
	}
	
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(400);
			}catch (InterruptedException e){}
		}
	}
}