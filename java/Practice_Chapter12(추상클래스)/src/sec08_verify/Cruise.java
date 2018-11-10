package sec08_verify;

public class Cruise extends Ship {

	@Override
	public int move() {
		System.out.println("Cruise가 나를수 있는 인원 : 300");
		return 0;
	}
	
	@Override
	public int carry() {
		System.out.println("Cruise가 나를수 있는 무기 : 200");
		return 0;
	}
	
	public String name() {
		System.out.println("Cruise 이름: 전함 무궁화, 인원 : 300, 무기 : 200");
		return null;
	}
	

}
