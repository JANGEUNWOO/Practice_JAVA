package sec06.exam03_view;

import javafx.beans.property.SimpleStringProperty;

public class Phone {

	// 필드의 타입이 SimpleStringProperty이다. Fx속성 타입의 클래스를 타입으로 설정
	// 이유는 속서감시를 통해서 값을 읽어올때 편리하게 하기 위해서다(FX API참조)
	private SimpleStringProperty smartPhone; // 테이블 뷰의 설정값
	private SimpleStringProperty image;

	// 생성자 선언
	public Phone() {
		this.smartPhone = new SimpleStringProperty(); // 단순 객체 생성
		this.image = new SimpleStringProperty(); // 단순 객체 생성

	}

	public Phone(String smartPhone, String image) {
		// 디폴트값으로 문자열 저장하여 객체 생성
		this.smartPhone = new SimpleStringProperty(smartPhone);
		// 디폴트값으로 문자열 저장하여 객체 생성
		this.image = new SimpleStringProperty(image);
	}
	// Getter, Setter 구현
	// 주목할 것은 리턴값과 매개값이 String 이므로 SimpleStringProperty객체의 get()메서드와
	// Set()메서드를 이용함을 기억하자

	public String getSmartPhone() {
		return smartPhone.get();
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}

	public String getImage() {
		return image.get();
	}

	public void setimage(String image) {
		this.image.set(image);
	}

}
