package sec05_verify;

public class Truck extends Car{


	int capacity;

	@Override
	public String toString() {
		
		return "트럭 속도는 "+speed+"km 색깔은 "+color+"좌석수는 "+capacity+"톤 입니다.";
		
	}
}
