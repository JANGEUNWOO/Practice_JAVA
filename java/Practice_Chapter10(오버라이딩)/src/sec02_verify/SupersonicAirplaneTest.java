package sec02_verify;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {
		
		SupersonicAirplane sa=new SupersonicAirplane();
		
		sa.takeOff();
		sa.flyMode=1;
		sa.fly();
		sa.flyMode=2;
		sa.fly();
		sa.flyMode=1;
		sa.fly();
		sa.land();
		
		
	}

}
