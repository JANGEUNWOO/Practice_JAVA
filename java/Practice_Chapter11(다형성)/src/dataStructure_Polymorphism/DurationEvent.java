package dataStructure_Polymorphism;

public class DurationEvent extends Event {

	MyDate begin;
	MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}

	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}
