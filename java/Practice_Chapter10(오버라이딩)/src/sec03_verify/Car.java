package sec03_verify;

public class Car {

	int Speed;
	
	
	final void speedUp() {
		Speed+=10;
		System.out.println("���� ������ī�� �ӵ��� "+Speed+"km�Դϴ�.");
	}
	
	void speedDown() {
		
		Speed-=10;
		System.out.println("���� ������ī�� �ӵ���"+Speed+"km�Դϴ�.");
		
	}
	
	void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
	
	
}
