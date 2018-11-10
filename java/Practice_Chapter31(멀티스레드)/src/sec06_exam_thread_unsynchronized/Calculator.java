package sec06_exam_thread_unsynchronized;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	public void setMemory(int memory) {
		this.memory = memory; // �ʱ�ȭ
		//2�� �Ͻ�����(TIMED_WAITING)
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e)	{}
		
		//���� ���ؿ��� ������ �̸��� memory���� ���
		System.out.println(Thread.currentThread().getName() + " : "+ this.memory);
	}
}
