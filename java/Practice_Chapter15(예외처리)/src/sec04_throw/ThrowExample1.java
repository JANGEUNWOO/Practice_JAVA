package sec04_throw;

public class ThrowExample1 {

	public static void main(String[] args) {
		
		
		try {
			throw new Exception("���Ƿ� �߻�������.");
		}
		//ExceptionŬ������ ��翹���� �����̹Ƿ� � ���ܵ� �� ���� �� �ִ�
		catch(Exception e) {
			//������ ���
			System.out.println("���� �޼���:"+e.getMessage());
			//���� �޸𸮿� �ִ� ������� ���(���߿�)
			e.printStackTrace();   //���� �߻� ��δ� ����
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");

	}

}
