package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) {

		ToiletUsingThread t1 = new ToiletUsingThread(new Toilet(), "�ƹ���");
		t1.start();
		
		ToiletUsingThread t2 = new ToiletUsingThread(new Toilet(), "��");
		t2.start();
		
		ToiletUsingThread t3 = new ToiletUsingThread(new Toilet(), "�ƹ���");
		t3.start();
		
		

	}

}
