package sec02_verify;

public class Television implements RemoteControl {
      
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume==10) {
			System.out.println("Television ������ �ִ�ġ ����"+MAX_VOLUME+"�Դϴ�. ������ "+MAX_VOLUME+"���� �����մϴ�!");
		}else if(volume==0) {
			System.out.println("Television ������ �ּ�ġ ����"+MIN_VOLUME+"�Դϴ�. ������ "+MIN_VOLUME+"���� �����մϴ�!");
		}
		this.volume=volume;
		System.out.println("���纼�� :"+this.volume);
		
	}
	
}
