package sec03_verify;

public class SmartTelevision implements RemoteControl, Searchable  {

	
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

	@Override
	public void smartSkill() {
		System.out.println("Smart기능을 시작합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			System.out.println("스마트TV의 볼륨의 최대치 값은 "+MAX_VOLUME+"입니다. 볼륨을 "+MAX_VOLUME+"으로 지정합니다!");
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			System.out.println("스마트TV의 볼륨의 최소치 값은 "+MIN_VOLUME+"입니다. 볼륨을 "+MIN_VOLUME+"으로 지정합니다!");
		    this.volume=RemoteControl.MIN_VOLUME;
		}
		this.volume=volume;
		System.out.println("현재 TV 볼륨:"+volume);
		
		
	}

}
