package sec_verify03;

public class BombThread extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(2600);
			findClass();
		} catch (Exception e) {
			System.out.println("��ź�� �����׿� ��!");
		}
	}
	public static void findClass() throws Exception{
		throw new Exception();
	}
}
