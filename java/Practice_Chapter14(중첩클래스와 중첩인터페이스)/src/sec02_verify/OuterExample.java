package sec02_verify;

public class OuterExample {

	public static void main(String[] args) {
		
		System.out.print("�ܺ�Ŭ������ �������� �ʰ�, "
				+ "�������Ŭ����(Inner)�� ���� ��� CV�� :");
		System.out.println(Outer.Inner.cv);
		
		
		
  
		System.out.print("�ܺ�Ŭ������ �����ϰ�, "
				+ "�������Ŭ����(Inner)�� �ν��Ͻ� ��� IV�� :");
		
		Outer.Inner in=new Outer.Inner();
		System.out.println(in.iv);
	}
}
