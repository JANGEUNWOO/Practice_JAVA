package sec01;

import java.util.Scanner;

public class Scheduler {
	// �迭�� ������ ����
	private int capacity = 10;

	// OneDayEvent DurationEvent DeadLinedEvent 3���� ������ ������ Ÿ���� ���Ϲ��� �� �־�� �Ѵ�.
	// �迭�� ����� ���̴�. ������ �迭�� ���� ������ �����͸� �����ϹǷ� �Ұ�..
	// �׷� ��� �� ���̳�? Ŭ���� ��� ���踦 �̿��ؼ� (�������� �̿��ؼ�)ó���غ���. Event ����Ŭ���� ����
	public Event[] events = new Event[capacity];
	public int n = 0;

	private Scanner kb;

	public void processCommand() {

		while (true) {
			System.out.print("$ ");
			kb = new Scanner(System.in);
			String command = kb.next();
			if (command.equals("addevent")) {
				String type = kb.next();
				if (type.equalsIgnoreCase("oneday")) {
					// �̾ȿ��� ���� ó���Ϸ��� �ڵ尡 ���������Ƿ� �޼��带 �ϳ� �����Ѵ�.
					handleAddOnedayEvent();
				} else if (type.equalsIgnoreCase("duration")) {

					handleAddDurationEvent();
				} else if (type.equalsIgnoreCase("deadline")) {

					handleAddDeadLinedEvent();
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

	private void handleList() {
		for (int i = 0; i < n; i++) {
			System.out.println("   " + events[i].toString()); // dynamic binding

		}

	}

	private void handleAddDeadLinedEvent() {
		// TODO Auto-generated method stub

	}

	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub

	}

	private void handleAddOnedayEvent() {
		System.out.print("when : ");
		String dateString = kb.next();

		System.out.println("title : ");
		String title = kb.next();

		// �޼��� ����
		MyDate date = parseDateString(dateString);

		// OneDayEvent ��ü�� ������ Event�迭�� �ִ´�.
		OneDayEvent ev = new OneDayEvent(title, date);
		System.out.println(ev.toString());

		addEvent(ev);

	}

	private void addEvent(OneDayEvent ev) {
		if (n >= capacity) {
			rellocate();
		}
		events[n++] = ev;

	}

	private void rellocate() {
		Event[] tmp = new Event[capacity * 2];
		for (int i = 0; i < n; i++) {
			tmp[i] = events[i];

		}
		events=tmp;   //??????????????
		capacity *=2;
	}

	// MyDate���� �̸��׸� 2018/10/26 �̶�� ���ڿ��� ��, ��, �Ϸ� ��ȯ���� ���ϹǷ� ������ ó�������� �ڵ尡 �ʿ��ϴ�.
	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");

		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);

		MyDate d = new MyDate(year, month, day);
		return d;

	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();

	}

}
