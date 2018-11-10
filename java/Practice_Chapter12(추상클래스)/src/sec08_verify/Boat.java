package sec08_verify;

public class Boat extends Ship {

	@Override
	public int move() {
	  System.out.println("Boat가 나를수 있는 인원 : 6");
	  return 0;
	}
	
	@Override
	public int carry() {
		System.out.println("Boat가 나를수 있는 무기 : 0");
		return 0;
	}
	
	public String name() {
		System.out.println("Boat 이름: 쌩쌩 보트, 인원 : 6, 무기 : 0 ");
		return null;
	}
	
}
