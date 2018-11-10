package sec01_exam_captionTv;

//조상클래스(부모,Super클래스)멤버갯수 :5개
public class Tv {

	boolean power; // 전원상태(on/off)
	int channel; // 채널

	public Tv() {
		System.out.println("조상클래스 생성자 호출");

	}

	// 전원기능
	public void power() {
		this.power = !power;
	}

	public void channelUp() {
		++this.channel;

	}

	public void channelDown() {
		--this.channel;
	}

}
