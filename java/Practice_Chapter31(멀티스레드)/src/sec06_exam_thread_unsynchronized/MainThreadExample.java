package sec06_exam_thread_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		// ������ü ����
		Calculator calculator = new Calculator();

		// ������ �����ΰ�? ��°���� ����, User2�� ������ ������ �� ��µȴ�.
		// ���� User1������� ���ϴ� ������ΰ�?
		// �� ������ ���� ��� �ذ��ϴ� �����? ---> �ٷ� ����ȭ�� �ʿ��� ���̴�.
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
