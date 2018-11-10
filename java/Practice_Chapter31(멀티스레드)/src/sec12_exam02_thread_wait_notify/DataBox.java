package sec12_exam02_thread_wait_notify;

public class DataBox {

	private String data;
	/*
	 * �Ʒ� getData()�� ConsumerThread�� data�� �о���� �Ǿ��ִ�. �׷��� null�̸� wait(�Ͻ�����:
	 * blocked����)�ϰ� ,null�� ��϶�� ConsumerThread�� ���� �����͸� ����ϸ缭, �ٸ� waiting�� �����带��
	 * notify�� ���ؼ� ��������·� �ٲ۴�.
	 * 
	 */

	public synchronized String getData() {
		// �о�� �����Ͱ� ���ٸ�...
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}

		}
		String returnValue = this.data;
		System.out.println("ConsummerThread�� ���� ������:" + returnValue);
		// �ٸ�������(������ ������)�� �����(�� ���������(Runnable)�� �����)
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// ConsumerThread�� �����͸� ���� �ʾҴٸ�...(ctrl+1)������ ����Ű)
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}

		}
		this.data = data;// �ʵ忡 ���� �����ϰ�
		System.out.println("ProducerThread�� ������ ������:" + this.data);
		notify();
	}
	
	/*
	 * ����������� wait()�� notify()�� �̿��Ͽ� ������ ������
	 * �� ������ü�� �����ϱ� ���ؼ��� synchornized�� ����ȭ Ű���尡
	 * ���� ���� ���ܵ� �߻����� �ƴ��ϰ�, �������� ��Ȯ���� ���尡��
	 * ��, ��ü����� �Ǿ�� �Ѵٴ� ��.
	 */

}
