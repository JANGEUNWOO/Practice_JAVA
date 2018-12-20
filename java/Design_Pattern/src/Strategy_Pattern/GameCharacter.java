package Strategy_Pattern;

public class GameCharacter {

	// ������
	private Weapon weapon;

	// ��ȯ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		if (weapon == null) {
			System.out.println("�Ǽհ���!");
		} else {
			// ��������Ʈ : �ٸ� ��ü�� ����� ����
			weapon.attack();
		}

	}

}
