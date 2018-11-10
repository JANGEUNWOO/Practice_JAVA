package sec01_stack_queue.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// message객체를 저장할 수 있는 즉, Queue인터페이스를 구현한 LinkedList를 생성
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendsms", "신은혁"));
		messageQueue.offer(new Message("sendkakaotalk", "김기수"));
		messageQueue.offer(new Message("sendfacebook", "하리수"));

		while (!messageQueue.isEmpty()) {
			// Queue에 저장되어 있는 message객체를 가져온다
			Message message = messageQueue.poll();

			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "에게 메일을 보냅니다.");
				break;
			case "sendsms":
				System.out.println(message.getTo() + "에게 sms를 보냅니다.");
				break;
			case "sendkakaotalk":
				System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
				break;
			case "sendfacebook":
				System.out.println(message.getTo() + "에게 페이스북을 보냅니다.");
				break;
			}
		}

	}

}
