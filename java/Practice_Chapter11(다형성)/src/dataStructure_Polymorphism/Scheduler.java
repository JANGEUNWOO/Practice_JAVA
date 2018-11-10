package dataStructure_Polymorphism;

import java.util.Scanner;

public class Scheduler {

	private int capacity = 100;
	Event[] events = new OneDayEvent[capacity];
	int n = 0;
	private Scanner kb;

	public void processCommand() {
		kb = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("addevent")) {
				String type = kb.next();
				if (type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} else if (type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} else if (type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
			} else if (command.equals("list")) {
				handleList();
			} else if (command.equals("show")) {

			} else if (command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}

	// 모든 이벤트들을 출력하는 메서드
	private void handleList() {
		for (int i = 0; i < n; i++) {
			System.out.println("  " + events[i].toString()); // dynamic binding
		}

	}

	private void handleAddOneDayEvent() {
		System.out.print(" when: ");
		String dateString = kb.next(); // dateString="2018/10/9"
		System.out.print(" title: ");
		String title = kb.next();

		MyDate date = parseDateString(dateString);

		OneDayEvent ev = new OneDayEvent(title, date);

		// System.out.println(ev.toString());
		addEvent(ev);

	}

	private void addEvent(OneDayEvent ev) {

		if (n >= capacity) {
			reallocate();
			events[n++] = ev;
		}

	}

    //배열 재할당 메서드(Array Reallocation)
	private void reallocate() {
		Event[] tmp = new Event[capacity * 2];
		for (int i = 0; i < n; i++) {
			tmp[i] = events[i];

		}
		events = tmp; // ????
		capacity *= 2;

	}

	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		// tokens[0]="2018";

		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);

		MyDate d = new MyDate(year, month, day);

		return d;
	}

	private void handleAddDurationEvent() {

	}

	private void handleAddDeadlineEvent() {

	}

	public static void main(String[] args) {

		String str = "012.3456.78.9.abc.defgh";
		String[] tokens = str.split("\\.");

		for (String token : tokens) {
			System.out.println(token);
		}

		/*
		 * for(int i=0;i<tokens.length;i++) { System.out.println(tokens[i]); }
		 */

		Scheduler app = new Scheduler();
		app.processCommand();

	}

}
