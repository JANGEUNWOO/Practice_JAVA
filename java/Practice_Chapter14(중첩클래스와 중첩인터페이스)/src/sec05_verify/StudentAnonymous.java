package sec05_verify;

public class StudentAnonymous {

	 Student field=new Student("문수빈") {
		
		 void goSchool() {
		   System.out.println(this.name+"이 등교합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println(this.name+"이 6시에 일어납니다.");
			this.goSchool();
		}
	 };
	 
	 void method1() {
		 
		 Student localVar=new Student("배한규") {
			 
			void goMovie() {
				System.out.println(this.name+"가 영화를 보러갑니다.");
			}
			@Override
			public void wake() {
				System.out.println(this.name+"이 9시에 일어납니다.");
				this.goMovie();
			}	 
		 };
		 localVar.wake();
	 }
	 
	 
	 void method2(Student student) {
		 student.wake();
	 }
	
}
