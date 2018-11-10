package sec02_exam_Instanceof;

class Car {

}

class FireEngine extends Car {

}

public class InstanceofEx1 {
	public static void main(String[] args) {

		FireEngine fe = new FireEngine();

		// instanceof �������� ����� ���̸� ����ȯ�� �����ϴٶ�� ���� �ָ�
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if (fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if (fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		// ��������.getClass()�� ���������� �ν��Ͻ��� �����Ͷ�� �޼����̸�
		// getName()�� �ش�Ŭ������ ��Ű���� Ŭ�������� ����ϴ� ���̴�.
		// ����, getSimpleName()�� ��Ű������ �����ϰ� �ܼ� Ŭ������ ����ϴ� �ż����̴�.
		System.out.println(fe.getClass().getName());
		System.out.println(fe.getClass().getSimpleName());
	}
}
