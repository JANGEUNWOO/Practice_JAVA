package sec01;

import java.util.Scanner;

public class Scheduler {
	// 배열의 사이즈 생성
	private int capacity = 10;

	// OneDayEvent DurationEvent DeadLinedEvent 3가지 종류의 데이터 타입을 리턴받을 수 있어야 한다.
	// 배열을 사용할 것이다. 하지만 배열은 같은 종류의 데이터만 저장하므로 불가..
	// 그럼 어떻게 할 것이냐? 클래스 상속 관계를 이용해서 (다형성을 이용해서)처리해본다. Event 상위클래스 생성
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
					// 이안에서 모든걸 처리하려면 코드가 번잡해지므로 메서드를 하나 생성한다.
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

		// 메서드 생성
		MyDate date = parseDateString(dateString);

		// OneDayEvent 객체를 생성해 Event배열에 넣는다.
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

	// MyDate에는 이를테면 2018/10/26 이라는 문자열을 년, 월, 일로 반환하지 못하므로 적절히 처리가능한 코드가 필요하다.
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
