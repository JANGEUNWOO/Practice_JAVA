package Strategy_Pattern;
//스트레티지 패턴

//여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
//게임캐릭터를 건드리지 않고 무기만 추가해 쉽게 수정을 할 수 있다.

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
