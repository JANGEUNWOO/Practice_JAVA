package sec04_verify;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		
		SmartPhone sp=new SmartPhone();
		
		sp.sendCall();
		sp.receiveCall();
		sp.sendSMS();
		sp.receiveSMS();
		sp.play();
		sp.stop();
		sp.calculate(3, 5);
		sp.scheduler();
		sp.applicationManager();
		

	}

}
