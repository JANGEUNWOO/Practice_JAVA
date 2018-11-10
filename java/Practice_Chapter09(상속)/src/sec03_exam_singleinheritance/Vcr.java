package sec03_exam_singleinheritance;

public class Vcr {

	boolean power; //전원상태(on/off)
	int counter=0;
	
	public Vcr() {
		super();   //Object생성자호출
		System.out.println("Vcr생성자 호출");
		
	}
	
	public void power() {
		power=!power;
		System.out.println("Vcr의 power 매서드를 호출하였습니다.");
		
	}
	public void play() {
		System.out.println("Vcr의 play매서드를 호출하였습니다.");
	}
	
	public void stop() {
		System.out.println("Vcr의 stop 매서드를 호출하였습니다.");
		
	}
	//되감기
	public void rew() {
		System.out.println("Vcr의 rew 매서드를 호출하였습니다.");
	}
	
	//빨리감기 >>
	public void ff() {
		System.out.println("Vcr의 ff매서드를 호출하였습니다.");
	}
	
	
	
}
