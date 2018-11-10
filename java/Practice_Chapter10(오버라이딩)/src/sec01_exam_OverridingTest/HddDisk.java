package sec01_exam_OverridingTest;
//조상클래스
public class HddDisk {

	int capacity;//용량
	int rpm;

	//기본생성자
	public HddDisk()
	{}
	
	//매개변수가 있는 생성자
	public HddDisk(int c,int r) {
		this.capacity=c;
		this.rpm=r;
	}
	
	public String Status() {
		return "하드디스크의 용량은"+this.capacity+"GB이며,"+"RPM은"+this.rpm+"입니다.";
	}
	
	
}
