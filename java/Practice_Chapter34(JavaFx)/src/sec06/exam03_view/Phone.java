package sec06.exam03_view;

import javafx.beans.property.SimpleStringProperty;

public class Phone {

	// �ʵ��� Ÿ���� SimpleStringProperty�̴�. Fx�Ӽ� Ÿ���� Ŭ������ Ÿ������ ����
	// ������ �Ӽ����ø� ���ؼ� ���� �о�ö� ���ϰ� �ϱ� ���ؼ���(FX API����)
	private SimpleStringProperty smartPhone; // ���̺� ���� ������
	private SimpleStringProperty image;

	// ������ ����
	public Phone() {
		this.smartPhone = new SimpleStringProperty(); // �ܼ� ��ü ����
		this.image = new SimpleStringProperty(); // �ܼ� ��ü ����

	}

	public Phone(String smartPhone, String image) {
		// ����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
		this.smartPhone = new SimpleStringProperty(smartPhone);
		// ����Ʈ������ ���ڿ� �����Ͽ� ��ü ����
		this.image = new SimpleStringProperty(image);
	}
	// Getter, Setter ����
	// �ָ��� ���� ���ϰ��� �Ű����� String �̹Ƿ� SimpleStringProperty��ü�� get()�޼����
	// Set()�޼��带 �̿����� �������

	public String getSmartPhone() {
		return smartPhone.get();
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}

	public String getImage() {
		return image.get();
	}

	public void setimage(String image) {
		this.image.set(image);
	}

}
