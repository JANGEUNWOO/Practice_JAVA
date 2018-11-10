package sec02_verify;

public class Audio implements RemoteControl  {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void turnOff(){
		System.out.println("Audio�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume==10) {
			System.out.println("Audio ������ �ִ�ġ ����"+MAX_VOLUME+"�Դϴ�. ������ "+MAX_VOLUME+"���� �����մϴ�!");
		}else if(volume==0) {
			System.out.println("Audio ������ �ּ�ġ ����"+MIN_VOLUME+"�Դϴ�. ������ "+MIN_VOLUME+"���� �����մϴ�!");
		}
		this.volume=volume;
		System.out.println("���纼����:"+this.volume);
	}
	
	
}
