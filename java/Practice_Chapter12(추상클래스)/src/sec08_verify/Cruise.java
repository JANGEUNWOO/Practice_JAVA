package sec08_verify;

public class Cruise extends Ship {

	@Override
	public int move() {
		System.out.println("Cruise�� ������ �ִ� �ο� : 300");
		return 0;
	}
	
	@Override
	public int carry() {
		System.out.println("Cruise�� ������ �ִ� ���� : 200");
		return 0;
	}
	
	public String name() {
		System.out.println("Cruise �̸�: ���� ����ȭ, �ο� : 300, ���� : 200");
		return null;
	}
	

}
