package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {
		
		
		StudentAnonymous anony=new StudentAnonymous();
		System.out.println("================================");
		System.out.println("�ʵ�(�������)�� �ʱⰪ���� ������ �ڽİ�ü");
		anony.field.wake();
		
		System.out.println("================================");
		System.out.println("================================");
		System.out.println("���ú����� �ʱⰪ���� ������ �ڽ� ��ü");
		anony.method1();
		
		
		System.out.println("================================");
		System.out.println("================================");
		System.out.println("�Ű������� �Ű������� �͸��ڼհ�ü�� ����");
		
		anony.method2(new Student("�迬��"){
			void goStudy() {
				System.out.println(this.name+"�� �����մϴ�.");
			}
			@Override
			public void wake() {
				System.out.println(this.name+"�� 4�ÿ� �Ͼ�ϴ�.");
				this.goStudy();
			}
		});
		
		
 }
}