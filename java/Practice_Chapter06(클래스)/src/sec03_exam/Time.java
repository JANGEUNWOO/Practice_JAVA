package sec03_exam;

public class Time {
        
	

	 /*
	 1.private : 같은 클래스내에서만 접근 가능
	 2.protected : 같은 패키지, 다른 패키지 자손클래스에서만 접근가능
	 3.default : 같은 패키지, 다른 패키지 접근가능
	 4.public : 어떤 클래스나 다 접근 가능
	 */

    //멤버 변수(접근제어자 private 외부로부터 값을 증감)
	private int hour;
	private int minute;
	private float second;
	
	//getter 메서드 : 멤버변수의 값을 가져가게 하는 매서드
	public int getHour() {
		//this는 객체 자신의 주소를 지니고 있는 것     참조변수와 동일
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public float getSecond() {
		return this.second;
	}
	
	//setter 매서드 : 멤버변수의 값을 저장하는 매서드
	public void setHour(int h) {
		if(h<0||h>23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour=h;
	}
	public void setMinute(int m) {
		if(m<0||m>59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute=m;
	}	
	public void setSecond(int s) {
		if(s<0||s>59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.second=s;
		
	}
	
	//Object클래스의 toString매서드 재정의(오버라이딩)함
	//this는 현재 자기 자신의 클래서를 의미함.
	
	@Override
	public String toString() {
		String str=this.getHour()+":"+this.getMinute()+":"+
	              this.getSecond()+"초입니다.";
	              return str;
	}
 
	



}
