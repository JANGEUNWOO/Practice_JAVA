package sec02_eaxm_final;

public class Person {

	final String nation = "korea"; // 상수 선언
	final String ssn; // 상수 선언
	String name;

	// final 초기화 방법
	// 1. 선언과 동시에 초기화
	// 2. 생성자에서 단 한번 초기화 가능

	// 매개변수가 있는 생성자
	public Person(String ssn, String name) {
		// this는 객체 자기 자신의 주소(참조변수를 동일) 지역변수와 멤버변수간의 구별을 하기 위해
		this.ssn = ssn;
		this.name = name;
	}

}
