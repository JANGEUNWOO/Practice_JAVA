package sec07_exam_generic_wildCard;

public class Student extends Person {

	// 외부에 받은 name을 가지고 조상클래스의 생성자 호출
	public Student(String name) {
		super(name);

		// super() 조상클래스 생성자 호출
		// super 조상클래스 멤버 호출
	}
}
