package sec01_verify;

public class OutterExample {

	public static void main(String[] args) {
		
		
		Outter outter=new Outter();
		Outter.Inner inner=outter.new Inner();
		
		System.out.print("�ܺ�Ŭ���� Outer�� �ν��Ͻ��� ������ ��, "
				+ "�ν��Ͻ����Ŭ����(Inner)�� �ν��Ͻ��� �����Ͽ� ����Ѱ� :");
		System.out.println(inner.a);

	}
}
