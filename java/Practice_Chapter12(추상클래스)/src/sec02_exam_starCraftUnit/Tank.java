package sec02_exam_starCraftUnit;

public class Tank extends Unit {

	String str;
	
	//생성자
	
	public Tank() {
		
	}
	
	@Override
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("탱크의 위치:"+this.x+","+this.y+"로 이동함.");
	}
	
	public void sizeMode() {
		this.str="공격모드:시즈모드 변환";
		System.out.println(this.str);
	}
	
}
