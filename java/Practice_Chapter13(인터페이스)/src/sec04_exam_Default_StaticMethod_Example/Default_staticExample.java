package sec04_exam_Default_StaticMethod_Example;

public class Default_staticExample {

	public static void main(String[] args) {
		
		
		Child c=new Child();
		//�ν��Ͻ��� �����ؾ� ȣ�Ⱑ���� default�޼��� ����,
		//������ �̸��̶�� �������̵��� �ؾ��Ѵ�.
		
		
		c.childmethod();
		c.parentmethod();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		
		//�ٷ� ���� ������ static�޼���
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();

	}

}
