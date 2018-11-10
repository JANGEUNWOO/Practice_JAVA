package sec_verify01;

public class Recording implements Runnable{


	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e){}
		}
	}
}
