package sec05_exam_annoymous_extends;

public class AnnoymousExample {

	public static void main(String[] args) {
		
		Annoymous anony=new Annoymous();
		//�͸��ڽİ�ü���� ������ �� wake�� ȣ��ȴ�.
		anony.field.wake();
		//�޼��� ȣ��� ���ÿ� ���ú����� �͸��ڽİ�ü �����Ǿ� �����ȴ�.
		anony.method();
		
		//�Ű������� �͸��ڽİ�ü�� �����ؼ� ȣ���ϰ� �ִ�.
		anony.method2(new Person(){
		
		  void study() {
			System.out.println("�����մϴ�.");
		  }
		  //����Ŭ������ wake�� �������̵��ϰ� �ִ�.
		  @Override
		  public void wake() {
			System.out.println("13�ÿ� �Ͼ�ϴ�.");
			this.study();
		  }
		});

	 }

}
