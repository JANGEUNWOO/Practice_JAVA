package sec01;

public class DurationEvent extends Event {

	public String title;
	public MyDate begin;
	public MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {

		super(title);
		this.begin = b;
		this.end = e;
	}
	
	public String toString() {
		return title+", "+begin.toString()+"~"+end.toString();
	}

}
