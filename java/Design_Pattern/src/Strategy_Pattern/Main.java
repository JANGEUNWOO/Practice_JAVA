package Strategy_Pattern;
//��Ʈ��Ƽ�� ����

//���� �˰����� �ϳ��� �߻����� �������� ����� ���� ������ ���� ��ȯ �����ϵ��� �ϴ� ����
//����ĳ���͸� �ǵ帮�� �ʰ� ���⸸ �߰��� ���� ������ �� �� �ִ�.

public class Main {

	public static void main(String[] args) {

		GameCharacter gc = new GameCharacter();
		gc.attack();
		
		gc.setWeapon(new Sword());
		gc.attack();
		
		gc.setWeapon(new Bow());
		gc.attack();
	}

}
