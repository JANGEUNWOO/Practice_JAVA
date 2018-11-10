package sec01_exam;

//속성 2개와 기능이 하나도 없는 클래스가 만들어짐
//하나의 Java파일에는 접근제어자 public 오로지 한개여야만 한다
//접근제어자
/*
 1.private : 같은 클래스내에서만 접근 가능
 2.protected : 같은 패키지, 다른 패키지 자손클래스에서만 접근가능
 3.default : 같은 패키지, 다른 패키지 접근가능
 4.public : 어떤 클래스나 다 접근 가능
 */


public class Student {
	//멤버변수(필드)
	String name="진창일";
	int age=28;
	
	//Object클래스와 Student클래스의 toString()
	
	@Override
	public String toString() {
		return "이름:"+this.name+",나이:"+this.age;
	}

	
	
	
	
}
