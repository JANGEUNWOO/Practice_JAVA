package sec16.exam02_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {

		// ���� ����ǰ� �ִ� ������ �׷��� ����
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup.getName();
		System.out.println(threadGroup1);

		// ���α׷��� �����׷����� ���������.
		ThreadGroup myGroup = new ThreadGroup("mygroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

		workThreadA.start();
		workThreadB.start();

		System.out.println("[���� ������ �׷��� list()�޼��� ȣ�� �� ��� ����]");
		// ���� ����ǰ� �ִ� ������ �׷��� ����
		mainGroup = Thread.currentThread().getThreadGroup();
		// ���� ���� �׷��� ��� ������ ��µ�(���� �׷� ����)
		mainGroup.list();
		System.out.println();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		// myGroup�� ���Ե� workThreadA�� B�� ���ͷ�Ʈ�Ǿ� �����(������׷��� ���� �ñ��� ����)
		myGroup.interrupt();
	}

}
