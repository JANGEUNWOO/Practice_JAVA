package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {
		System.out.println("�١١ٳ��� �켱������ ��������Ʈ�١١�");
		System.out.println("�����̸�   �ҿ�ð�   �켱����");
		Task task=new Task("�������",30);
		task.setPriority(3);
		task.getPriority();

		Task task2=new Task("���а���",80);
		task2.setPriority(1);
		task2.getPriority();
		
		Task task3=new Task("�ڹٰ���",150);
		task3.setPriority(2);
		task3.getPriority();
	}
}
