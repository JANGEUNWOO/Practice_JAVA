package sec03_verify;

public class SportsCar extends Car {

	int getSpeed() {
		System.out.println("���� ������ī�� �ӵ��� "+Speed+"km�Դϴ�.");
		return Speed;
	}
	
	void stop() {
	super.stop();
	System.out.println("������ī�� ����ϴ�.");	
    }
	
	
	
}
