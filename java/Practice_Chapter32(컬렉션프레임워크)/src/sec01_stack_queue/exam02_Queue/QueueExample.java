package sec01_stack_queue.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// message��ü�� ������ �� �ִ� ��, Queue�������̽��� ������ LinkedList�� ����
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendsms", "������"));
		messageQueue.offer(new Message("sendkakaotalk", "����"));
		messageQueue.offer(new Message("sendfacebook", "�ϸ���"));

		while (!messageQueue.isEmpty()) {
			// Queue�� ����Ǿ� �ִ� message��ü�� �����´�
			Message message = messageQueue.poll();

			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "���� ������ �����ϴ�.");
				break;
			case "sendsms":
				System.out.println(message.getTo() + "���� sms�� �����ϴ�.");
				break;
			case "sendkakaotalk":
				System.out.println(message.getTo() + "���� īī������ �����ϴ�.");
				break;
			case "sendfacebook":
				System.out.println(message.getTo() + "���� ���̽����� �����ϴ�.");
				break;
			}
		}

	}

}
