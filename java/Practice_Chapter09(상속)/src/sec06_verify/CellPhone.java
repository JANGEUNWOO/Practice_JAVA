package sec06_verify;

public class CellPhone {

	String model;
	String color;
	String send;
	String receive;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String send) {
	   System.out.println("�ڱ�:"+send);
	}
	void receiveVoice(String receive) {
		System.out.println("���:"+receive);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
	
	
	
}
