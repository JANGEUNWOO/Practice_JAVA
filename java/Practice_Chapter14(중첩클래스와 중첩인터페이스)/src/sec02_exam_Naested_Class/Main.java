package sec02_exam_Naested_Class;

public class Main {

	public static void main(String[] args) {
		
		
		A a=new A(); //�ܺ�(�ٱ�Ŭ����)Ŭ���� �ν��Ͻ� ����
		//AŬ������ ����������� ����(����)Ŭ���� �ν��Ͻ� ����
		//(���� �ܺ�Ŭ������ �ν��Ͻ��� �����ؾ��Ѵ�.)
		
		A.B b=a.new B();
		b.method1();//b�� ����޼��常 method1ȣ��
		//����(static)����� �ν��Ͻ� ����(�ܺ�Ŭ������ �ν��Ͻ� �������� �ٷ� ����)
		
		A.C c=new A.C();
		System.out.println(c.b);
		A.C.method3();
		
		//�ܺ�Ŭ������ ����޼��常 method�� ȣ�������ǽ�
		//����Ŭ������ �ν��Ͻ��� ������.
		a.method();

	}

}
