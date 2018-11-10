package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {

		ToiletUsingThread t1 = new ToiletUsingThread(new Toilet(), "아버지");
		t1.start();
		
		ToiletUsingThread t2 = new ToiletUsingThread(new Toilet(), "딸");
		t2.start();
		
		ToiletUsingThread t3 = new ToiletUsingThread(new Toilet(), "아버지");
		t3.start();
		
		

	}

}
