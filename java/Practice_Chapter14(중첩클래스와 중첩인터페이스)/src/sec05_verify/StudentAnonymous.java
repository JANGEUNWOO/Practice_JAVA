package sec05_verify;

public class StudentAnonymous {

	 Student field=new Student("������") {
		
		 void goSchool() {
		   System.out.println(this.name+"�� ��մϴ�.");
		}
		
		@Override
		public void wake() {
			System.out.println(this.name+"�� 6�ÿ� �Ͼ�ϴ�.");
			this.goSchool();
		}
	 };
	 
	 void method1() {
		 
		 Student localVar=new Student("���ѱ�") {
			 
			void goMovie() {
				System.out.println(this.name+"�� ��ȭ�� �������ϴ�.");
			}
			@Override
			public void wake() {
				System.out.println(this.name+"�� 9�ÿ� �Ͼ�ϴ�.");
				this.goMovie();
			}	 
		 };
		 localVar.wake();
	 }
	 
	 
	 void method2(Student student) {
		 student.wake();
	 }
	
}
