package sec_verify01;

public class MovieThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("녹화를 진행합니다.");
			try {
				Thread.sleep(800);
			}catch (InterruptedException e){}
		}
	}
}
