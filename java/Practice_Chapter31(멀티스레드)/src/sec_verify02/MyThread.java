package sec_verify02;

public class MyThread extends Thread {

	public MyThread() {
		this.setName("MyThread");  //스레드 이름 설정
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