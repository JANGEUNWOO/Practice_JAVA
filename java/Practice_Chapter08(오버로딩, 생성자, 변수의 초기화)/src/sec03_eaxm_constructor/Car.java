package sec03_eaxm_constructor;

public class Car {

	String color; // ����
	String gearType; // ���ӱ� ����>auto, manual
	int door;

	// ������
	// �ƹ��� �����ڰ� ����Ǿ� ���� �ʴٸ�,�����Ϸ��� �˾Ƽ� �⺻�����ڸ�
	// �߰����شٴ� ���� �������.

	public Car() {
		this("white", "auto", 4);
		System.out.println("�⺻������ ȣǮ");

	}

	// �Ű������� �ִ� ������
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�Ű������� �ִ� ������ ȣ��");

	}

	// ������̼�(annotation):�����Ϸ����� ���ϰ� üũ�� �϶�� ��.
	// (���� ������ ������ �´��� �ѹ� ����� �ǹ�)

	@Override
	public String toString() {
		String str = "���� : " + this.color + "\n���Ÿ�� : " + this.gearType + "\n�� ���� : " + this.door;
		return str;

	}

}
