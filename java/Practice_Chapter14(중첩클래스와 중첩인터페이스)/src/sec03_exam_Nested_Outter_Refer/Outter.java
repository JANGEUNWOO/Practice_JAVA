package sec03_exam_Nested_Outter_Refer;

public class Outter {
	String field="Outter_field";
	
	//�ܺ�Ŭ���� �޼���
	public void method() {
		System.out.println("�ٱ�Ŭ���� �޼��� ȣ��");
	}
	
	class Nested{
		//����Ŭ���� �������
		String field="Inner_Field";
		//����Ŭ���� �޼���
		public void method() {
			System.out.println("����Ŭ���� �޼��� ȣ��");
		}
		//����Ŭ�� �޼���
		public void print() {
			//���⿡���� this�� ���� Ŭ������ �ڽ��� �ǹ�
			System.out.println(this.field);
			this.method();
			//����Ŭ���� ����� ���� ����� ��Ÿ��.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
