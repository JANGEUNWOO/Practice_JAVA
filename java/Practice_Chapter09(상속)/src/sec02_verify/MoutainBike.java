package sec02_verify;

public class MoutainBike extends Bicycle{

	String frame;
	int gear;
	String money;
	
	void prtlnfo() {
		System.out.println("�� �����Ŵ� ��ǥ(�귣��)�� :"+brand+"�Դϴ�.");
		System.out.println("���� "+gear+"�� �Դϴ�.");
		System.out.println("��������"+frame+"�Դϴ�.");
		System.out.println("������"+money+"�Դϴ�.");
	}
	
	MoutainBike(int id, String brand) {
		super(id, brand);
		
	}
}
