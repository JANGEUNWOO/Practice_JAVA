package sec00_exam_InterfaceExample;

public class Example {

	public static void main(String[] args) {
		
		
		//�������̽��� �����ߴٴ¶�� ���� ����Ŭ������ ������ ������ �ǹ��Ѵ�.
		//�׷��� �������� ����
		
		A a=new Person();
		Person p=new Person();
		a.method();
		//a.method2();  //�ٺ��� �ٸ�...
		p.method();
		
		A a1=new Member();  //�������̽� �ʵ��� �������� ����
		a1.method();
	}

}
