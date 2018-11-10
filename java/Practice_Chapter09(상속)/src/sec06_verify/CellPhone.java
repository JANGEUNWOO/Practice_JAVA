package sec06_verify;

public class CellPhone {

	String model;
	String color;
	String send;
	String receive;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String send) {
	   System.out.println("자기:"+send);
	}
	void receiveVoice(String receive) {
		System.out.println("상대:"+receive);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
	
	
}
