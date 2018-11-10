package sec06_verify;

public class Car {

	Tire frontLeftTire= new HankookTire();
	Tire frontRightTire= new HankookTire();
	Tire backLeftTire= new HankookTire();
	Tire backRightTire= new HankookTire();
	
	
	
	public void run() {
		
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

}
