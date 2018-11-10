package sec_verify03;

public class ThreadExample {

	public static void main(String[] args) {
	
		NumberThread nt = new NumberThread();
		BombThread bt = new BombThread();
		nt.start();
		bt.start();

	}
}
