package sec05_throws;

public class ThrowsExample01 {
	//�̷��� ȣ���ϸ� ���� ���ܸ� ��Ƽ� ó���� ����� �ϳ�? ��������� ��� �ǳ�?
	public static void main(String[] args) {
        
		 try {
	         method1();
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } //���� Ŭ���� ���� static�ɹ��̹Ƿ� ��ü���� ���� ���� ȣ�� ����
	   } //���� �޼����� ��

	
	

	public static void method1() throws Exception{
		method2();
		//method1�� ��
	}
	
	public static void method2() throws Exception{
		throw new Exception(); //���� �߻����
		//method2�� ��
	}

}
