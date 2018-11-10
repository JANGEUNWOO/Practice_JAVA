package sec07_exam_thread_synchronized;

public class MainThreadExample {

	public static void main(String[] args) {

		// ������ü ����
		Calculator calculator = new Calculator();

		// ������ �����ΰ�? ��°���� ���� user2�� ������ ������ �� ��µȴ�.
		// ���� user1������� ���ϴ� ������� ����°�?
		// �� ������ ���� ��� �ذ��ؾ� �ϳ�? -> ����ȭ�� �ʿ��ϴ�

		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
