package sec05_verify;

public class Sedan extends Car {
	
	int seatNum;
	@Override
	public String toString() {
		return "승용차의 속도는 "+speed+"km, 색깔은 "+color+"좌석수는 "+seatNum+"입니다.";
	}

}
