package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

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
