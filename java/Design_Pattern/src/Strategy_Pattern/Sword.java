package Strategy_Pattern;

public class Sword implements Weapon {

	// 인터페이스에 선언된 기능을 구현
	@Override
	public void attack() {

		System.out.println("검 공격!");

	}

}
