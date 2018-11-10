package sec01;

public class MyDate {

	int year;
	int month;
	int day;
	
	public MyDate(int y, int m, int d) {
		year=y;
		month=m;
		day=d;
	}
	
	public String toString() {
		return year+"/"+month+"/"+day;
	}
}
