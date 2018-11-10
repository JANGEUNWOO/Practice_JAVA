package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {
		
		
		StudentAnonymous anony=new StudentAnonymous();
		System.out.println("================================");
		System.out.println("필드(멤버변수)의 초기값으로 생성된 자식객체");
		anony.field.wake();
		
		System.out.println("================================");
		System.out.println("================================");
		System.out.println("로컬변수의 초기값으로 생성된 자식 객체");
		anony.method1();
		
		
		System.out.println("================================");
		System.out.println("================================");
		System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
		
		anony.method2(new Student("김연아"){
			void goStudy() {
				System.out.println(this.name+"가 공부합니다.");
			}
			@Override
			public void wake() {
				System.out.println(this.name+"가 4시에 일어납니다.");
				this.goStudy();
			}
		});
		
		
 }
}