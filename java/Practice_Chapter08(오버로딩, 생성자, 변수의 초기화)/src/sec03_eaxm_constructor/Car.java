package sec03_eaxm_constructor;

public class Car {

	String color; // 색상
	String gearType; // 변속기 종류>auto, manual
	int door;

	// 생성자
	// 아무런 생성자가 선언되어 있지 않다면,컴파일러가 알아서 기본생성자를
	// 추가해준다는 것을 명심하자.

	public Car() {
		this("white", "auto", 4);
		System.out.println("기본생성자 호풀");

	}

	// 매개변수가 있는 생성자
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("매개변수가 있는 생성자 호출");

	}

	// 어노테이션(annotation):컴파일러에게 강하게 체크를 하라는 뜻.
	// (내가 재정의 했으니 맞는지 한번 보라는 의미)

	@Override
	public String toString() {
		String str = "색깔 : " + this.color + "\n기어타입 : " + this.gearType + "\n문 갯수 : " + this.door;
		return str;

	}

}
