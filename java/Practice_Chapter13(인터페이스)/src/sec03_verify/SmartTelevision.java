package sec03_verify;

public class SmartTelevision implements RemoteControl, Searchable  {

	
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}

	@Override
	public void smartSkill() {
		System.out.println("Smart����� �����մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			System.out.println("����ƮTV�� ������ �ִ�ġ ���� "+MAX_VOLUME+"�Դϴ�. ������ "+MAX_VOLUME+"���� �����մϴ�!");
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			System.out.println("����ƮTV�� ������ �ּ�ġ ���� "+MIN_VOLUME+"�Դϴ�. ������ "+MIN_VOLUME+"���� �����մϴ�!");
		    this.volume=RemoteControl.MIN_VOLUME;
		}
		this.volume=volume;
		System.out.println("���� TV ����:"+volume);
		
		
	}

}
