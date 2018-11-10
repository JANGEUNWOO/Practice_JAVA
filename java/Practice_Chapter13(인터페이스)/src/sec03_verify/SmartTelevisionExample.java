package sec03_verify;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		
		SmartTelevision remotetv=new SmartTelevision();
		
		remotetv.turnOn();
		remotetv.setVolume(11);
		remotetv.setVolume(-4);
		remotetv.setMute(true);
		remotetv.setMute(false);
		remotetv.turnOff();
		RemoteControl.changeBattery();
		
		remotetv.smartSkill();
		remotetv.search("www.naver.com");
	}

}
