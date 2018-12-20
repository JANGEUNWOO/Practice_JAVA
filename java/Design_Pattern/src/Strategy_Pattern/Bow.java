package Strategy_Pattern;

public class Bow implements Weapon  {

	
	//인터페이스에 선언된 기능을 구현 
	@Override
	public void attack() {
		System.out.println("활 공격!");
		
	}
	
}
