package Strategy_Pattern;

public class GameCharacter {

	// 접근점
	private Weapon weapon;

	// 교환가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {
		if (weapon == null) {
			System.out.println("맨손공격!");
		} else {
			// 델리게이트 : 다른 객체에 기능을 위임
			weapon.attack();
		}

	}

}
