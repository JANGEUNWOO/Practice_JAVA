package sec02_verify;

public class SmartPhone extends Phone {

	SmartPhone(String owner){
		super(owner);
		
	}
	
	void turnOn() {
	  System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
	  System.out.println("폰 전원을 끕니다.");
	}
	
	void internetSearch() {
	  System.out.println("네이버를 검색합니다.");
	}
		
	
}
