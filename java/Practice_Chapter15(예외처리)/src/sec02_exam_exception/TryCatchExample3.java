package sec02_exam_exception;

public class TryCatchExample3 {

	public static void main(String[] args) {
		
		
		//ClassŬ������ �L���� ������ Ŭ������ ���� ��ȯ���ش�.
		//�ν��Ͻ��� ����� �� ������, ��ȯ�� �ν��Ͻ��� ������ �� ���̴�.
		//������, ���ڿ��� �ش��ϴ� Ŭ������ ���ٸ� �Ϲ� ���ܰ� �߻��Ѵ�.
		//�׷��� �������� ���� �ʴ´�. �� �ٽø��� ����ó���� �ʼ����̴�.
		try {
			Class clazz=Class.forName("java.lang.String2");
			//Class clazz=Class.forname("java.lang.String");
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}
		//���ܴ� �߻������� �������� ���� �˼��� �ִ�.
		catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		//�׻� �����Ѵ�.
		finally {
			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}

	}

}
