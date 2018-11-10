package sec01_exam_OverridingTest;

public class UsbMemory extends HddDisk {

	
	int capacity;
	int rpm;
	
	//조상클래스의 생성자를 호출하면서 자기자신의 멤버변수를 초기화 한다.
	
	public UsbMemory(int c, int r) {
		super(10,50);//조상클래스의 매개변수 있는 생성자를 호출함
		this.capacity=c;
		this.rpm=r;
	}
	
	
	//조상클래스의 매서드를 오버라이딩 했다.
	@Override
	public String Status() {
		return "하드디스크의 용량은"+super.capacity+"GB이며,"+"RPM은"+super.rpm+"입니다.";
	}
	
}
