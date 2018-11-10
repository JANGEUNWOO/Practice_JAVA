package sec02_eaxm_final;

public class PersonExample {

	public static void main(String[] args) {
		
		//매개변수가  있는 생성자를 호출하는 것!
		Person p1=new Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//p1.nation="usa";        //컴파일 예외이유?  >>상수를 바꾸려고 해서...
		//System.out.println(p1.nation);
		//p1.ssn="654321-7654321" //컴파일 예외이유?  >>상수를 바꾸려고 해서...
		p1.name="을지문덕";
        System.out.println(p1.name);
	}

}
