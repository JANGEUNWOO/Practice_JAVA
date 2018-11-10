package sec03_exam_singleinheritance;

public class Tv {

	boolean power; //전원상태(on/off)
	int channel=10; //체널
	//기본생성자
	
	public Tv() {
		super(); //Object생성자 호출
		System.out.println("Tv조상클래스 생성자 호출");
	}
	
	public void power() {
		this.power=!this.power;
		System.out.println("조상클래스 Tv의 power매서드를 호출하였습니다.");
		
	}
	
	public void channelUp() {
		++this.channel;
		System.out.println("조상클래스 Tv의 channelUp매서드를 호출하였습니다.");
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("조상클래스 Tv의 channelDown매서드를 호출하였습니다.");
	}
	
	
	
	
}
