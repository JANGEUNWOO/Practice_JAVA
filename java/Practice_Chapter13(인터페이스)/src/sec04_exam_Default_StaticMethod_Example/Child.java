package sec04_exam_Default_StaticMethod_Example;


//Parent����Ŭ������ ��ӹް�, �ƿ﷯ �������̽� 1,2�� ������
//��, �������̽��� ����Ʈ�޼���� static�޼��常 �ֱ⿡ �������� �޼��尡 �ִ�.
//�������̽��� �߻�޼��尡 ������ �ռ� ���ǿ����� ��������, �ݵ�� �����ǰ� �ʿ��ϴ�.

public class Child extends Parent implements MyInterface1, MyInterface2 {

	public void childmethod() {
		System.out.println("�ڼ�Ŭ�������� ȣ���� �޼���");
	}
	
	@Override
	public void method1() {
		System.out.println("�ڼ�Ŭ�������� MyInterface1�� method()�� "+"�������̵��� �޼���");
	}
	
}
