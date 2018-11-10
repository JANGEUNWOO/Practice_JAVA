package sec03_verify;

public class Tire {

	int maxRotation;          //최대 회저수(최대수명)
	int accumulatedRotation;  //누적 회전수
	String location;          //타이어의 위치
	
	Tire(String location, int maxRotation ) {
	this.location=location;
	this.maxRotation=maxRotation;

	}
	
	
	boolean roll() {
	++accumulatedRotation;
	if(accumulatedRotation<maxRotation) {
		System.out.println(location+"수명:"+(maxRotation-accumulatedRotation)+"회");
		return true;
	}else {
		System.out.println(location+"펑크났습니다.");
		return false;
	}
	}
	
	
	
	
	
}
