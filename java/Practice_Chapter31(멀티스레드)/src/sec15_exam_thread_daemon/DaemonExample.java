package sec15_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		
		AutoSaveThread autoSaveThread=new AutoSaveThread();
		//daemon����(���� start()ȣ������ ������ �ؾ��Ѵ�.
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		if(autoSaveThread.isDaemon())
			System.out.println("autoSaveThread�� ���󽺷����Դϴ�.");
		//���ν����尡 5�ʵ��� �����ϸ� daemon�������� ���似�̺꽺���尡
		//����ǰ� ���ν����尡 ����Ǹ� ���̻� autoSavethread�� ������
		//�ȵǴٴ� ���� �˼��� �ִ�
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("���ν����� �����");

	}

}
