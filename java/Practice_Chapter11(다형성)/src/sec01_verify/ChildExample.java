package sec01_verify;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.method1();
		p.method2();
		
		Child c=new Child();
		c.method1();
		c.method2();  //�ڼ�Ŭ�������� �޼���2 �������̵� �� ���� ���
		c.method3();
		
		Parent z=new Child();
		z.method1(); //����Ŭ���� �޼���1 ���
		z.method2(); //�������̵��� �ڼ�Ŭ���� �޼���2 ���
		//z.method3(); //�ڼ�Ŭ���� �ż���3 ��� ����> �ٺ��� �ٸ� Parent���� �޼ҵ�3�� ����Ϸ��� �����ɸ� 

		
	}

}
