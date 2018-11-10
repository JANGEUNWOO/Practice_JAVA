package sec02_exam;

public class Tv {

	
	//Tv의 속성(멤버변수) 다른 말로 필드라고도 한다.
	String color; //색상
	boolean power; //전원상태(on/off)
	int channel;
	
	//멤버메서드(함수)
	//Tv를 키거나 끄는 기능을 하는 메서드
	public void power() {
		this.power=!this.power;
	}
	//Tv의 체널을 높이는 기능을 하는 메서드
	public void channelUp(){
		++this.channel;
		
	}
	//Tv의 체널을 낯추는 기능을 하는 메서드
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("체널은 음수값이 없습니다.");
			
		}
		--this.channel;
	}
	
}
