package sec02_verify;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl remoteTv=new Television();
		remoteTv.turnOn();
		remoteTv.setVolume(10);
		remoteTv.setVolume(0);
		remoteTv.setMute(true);
		remoteTv.setMute(false);
		remoteTv.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println();
		
		RemoteControl remoteAu=new Audio();
		remoteAu.turnOn();
		remoteAu.setVolume(10);
        remoteAu.setVolume(0);
        remoteAu.setMute(true);
        remoteAu.setMute(false);
        remoteAu.turnOff();
        RemoteControl.changeBattery();
	}

}
