package sec06_verify;

public class DmbCellPhone extends CellPhone {

	
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		
	}
	
	void turnonDmb() {
		System.out.println("DMB 10�� ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb() {
		System.out.println("ä���� 12������  �ٲߴϴ�.");
	}
	
	void turnoffDmb() {
		System.out.println("DMB ��ۼ����� ����ϴ�.");
	}
	
}
