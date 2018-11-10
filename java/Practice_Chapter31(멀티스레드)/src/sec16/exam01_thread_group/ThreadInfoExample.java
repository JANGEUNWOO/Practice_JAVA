package sec16.exam01_thread_group;

import java.util.Map;
import java.util.Set;

import sec15_exam_thread_daemon.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
		// ������ �̸� ����(�������� �ƴ��ϸ� Thread-n���� ǥ�ôµǴ� ���� �پȴ�.)
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true); // �������� ���� 
		//�ּ�ó���ϸ� �۾��������������� ��� ����
		autoSaveThread.start();

		// Map�÷���<Ű,��> Ű�� ���� ã�ƿ��� �˰����� �� ����

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		// Map�� Ű���� SEt���·� �����´�(Set�� �����ָӴ� ���� �����̴�)
		Set<Thread> threads = map.keySet();

		for (Thread thread : threads) {
			System.out.println("������ �̸�:" + thread.getName() + ((thread.isDaemon() ? "(���󽺷���)" : "(�ֽ�����)")));
			// ������ �׷� ���
			System.out.println("\t �Ҽ� �׷� :" + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
