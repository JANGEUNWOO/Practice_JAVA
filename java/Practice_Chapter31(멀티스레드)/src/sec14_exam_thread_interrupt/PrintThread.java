package sec14_exam_thread_interrupt;

public class PrintThread extends Thread {


	@Override
	public void run() {
		//�Ʒ��� �Ϻη� �Ͻ����� ���·� ���� ���̴�. ���������� �̷� �ڵ��� ����.
		//�Ͻ����� ���¸� ������ �ʰ� �����Ű�� ���� ���δ�.
		/*
		 * try{
		 * while(true){
		 * System.out.println("������");
		 * Thread.sleep(1); //�Ͻ�����(interrupt()�� ȣ��Ǹ� ���� �߻�)
		 * }
		 * }catch(InterruptedException e){
		 * System.out.println("���� �߻�");
		 *  System.out.println("������ �ڿ� ����");
		 *   System.out.println("������ ����");
		 */
		
		//���� �޼����� Interrupted()�� �ν��Ͻ� �޼����� Interrupted()�� �̿���
		//������ ������
		while (true) {
			System.out.println("���� ��");
			//Interrupted()�� ȣ��Ǿ�����?
			if(Thread.interrupted()) //interrupted()�� ȣ��Ǹ� true�� ����
				break;  //ȣ��Ǿ����� ���� Ż��
			//if(this.isInterrupted()){
			   //break;  //ȣ��Ǿ����� ���� Ż��
			//}
		}
		System.out.println("Interrupt()ȣ�� ��");
		System.out.println("������ �ڿ����� ");
		System.out.println("������ ����");
	}
	/*
	 * ����������� �������� �ݺ����� �����ϱ� ���ؼ��� ���� ���� ����� Interrupt()�� �̿��ϴ�
	 * ���� ���� �̻����̴�. �Ͻ������� �ְ� ���� ���� �������� ����� �����ϴ� ��� �� ���� �θ�
	 * �̿�ȴ�.
	 */

}
