package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.

	public static void save(String input) {
		Scanner sc = new Scanner(System.in);

		if (MAX_SIZE >= q.size()) {
			for (int i = 0; i <= MAX_SIZE; i++) {
				System.out.print(">>");
				q.offer(sc.next());
				System.out.println(q.peek());
				
				
			}
			if (sc.next() == "history") {
				q.peek();
			}

		}

	}

	public static void main(String[] args) {

		QueueEx.save(null);

	}

}
