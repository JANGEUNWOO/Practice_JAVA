package sec05_exam_annoymous_extends;
//조상클래스
public class Person {

	String name;
	public Person() {
		System.out.println("조상 생성자");
	}
	
	public void wake(){
		System.out.println("10시에 일어납니다.");
	}
	
}
