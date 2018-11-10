package sec01;

public class DeadLinedEvent extends Event{

	public String title;
	public MyDate deadline;

	public DeadLinedEvent(String title, MyDate date) {
		super(title);
		this.deadline = date;
	}

	public String toString() {
		return title+", "+deadline.toString();
	}
}
