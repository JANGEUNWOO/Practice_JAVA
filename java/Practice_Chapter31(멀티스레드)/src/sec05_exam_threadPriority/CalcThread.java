package sec05_exam_threadPriority;

public class CalcThread extends Thread {

	int sum;

	public CalcThread(String name) {
		this.setName(name);

	}

	@Override
	public void run() {
		for (int i = 0; i < 20000000; i++) {
			sum += i;

		}

		System.out.println("�۾��� ��ģ ������:" + this.getName() + ",�հ� : " + this.sum);
	}
}
