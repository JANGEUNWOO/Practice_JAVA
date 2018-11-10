package sec03_verify;

public interface RemoteControl {

	        int MAX_VOLUME = 10;
			int MIN_VOLUME =  0;
			
			
			void turnOn();
			void turnOff();
			void setVolume(int volume);
			default void setMute(boolean mute) {
				if(mute==true) {
					System.out.println("무음처리 합니다.");
				}else {
					System.out.println("무음해체 합니다.");
				}
			}
			
			static void changeBattery() {
				System.out.println("건전지를 교환합니다.");
			}
	
	
	
}
