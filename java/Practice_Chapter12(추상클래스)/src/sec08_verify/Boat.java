package sec08_verify;

public class Boat extends Ship {

	@Override
	public int move() {
	  System.out.println("Boat�� ������ �ִ� �ο� : 6");
	  return 0;
	}
	
	@Override
	public int carry() {
		System.out.println("Boat�� ������ �ִ� ���� : 0");
		return 0;
	}
	
	public String name() {
		System.out.println("Boat �̸�: �߽� ��Ʈ, �ο� : 6, ���� : 0 ");
		return null;
	}
	
}
