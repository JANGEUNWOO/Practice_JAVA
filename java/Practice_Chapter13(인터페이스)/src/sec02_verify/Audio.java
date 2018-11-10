package sec02_verify;

public class Audio implements RemoteControl  {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff(){
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume==10) {
			System.out.println("Audio 볼륨의 최대치 값은"+MAX_VOLUME+"입니다. 볼륨을 "+MAX_VOLUME+"으로 지정합니다!");
		}else if(volume==0) {
			System.out.println("Audio 볼륨의 최소치 값은"+MIN_VOLUME+"입니다. 볼륨을 "+MIN_VOLUME+"으로 지정합니다!");
		}
		this.volume=volume;
		System.out.println("현재볼륨은:"+this.volume);
	}
	
	
}
