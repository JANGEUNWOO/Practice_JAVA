package sec00_exam_InterfaceExample;
//��Ӱ� ������ ���ÿ� �Ҽ� �ִ� ��
public class Fighter extends Unit implements Fightable {
	//�������̽��� �ִ� �߻�޼��� ������
	@Override
	public void move(int x, int y) {
		System.out.println("�̵��մϴ�.");
		
	}
	//�������̽��� �ִ� �߻�޼��� ������
	@Override
	public void attack(Unit u) {
		System.out.println("�����մϴ�.");
		
	}
	
}
