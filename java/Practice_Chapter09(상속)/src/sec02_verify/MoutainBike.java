package sec02_verify;

public class MoutainBike extends Bicycle{

	String frame;
	int gear;
	String money;
	
	void prtlnfo() {
		System.out.println("내 자전거는 상표(브랜드)가 :"+brand+"입니다.");
		System.out.println("기어는 "+gear+"단 입니다.");
		System.out.println("프레임은"+frame+"입니다.");
		System.out.println("가격은"+money+"입니다.");
	}
	
	MoutainBike(int id, String brand) {
		super(id, brand);
		
	}
}
