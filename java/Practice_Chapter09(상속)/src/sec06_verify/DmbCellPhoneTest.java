package sec06_verify;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		
		DmbCellPhone dm=new DmbCellPhone("�ڹ���", "����", 10);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("��������.");
		dm.receiveVoice("�� �ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dm.sendVoice("��~�� �ݰ����ϴ�.");
		dm.hangUp();
		dm.turnonDmb();
		dm.changeChannelDmb();
		dm.turnoffDmb();
	}
}
