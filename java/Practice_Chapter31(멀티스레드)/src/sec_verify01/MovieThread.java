package sec_verify01;

public class MovieThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("��ȭ�� �����մϴ�.");
			try {
				Thread.sleep(800);
			}catch (InterruptedException e){}
		}
	}
}
