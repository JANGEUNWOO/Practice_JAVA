package dataStructure_Polymorphism;

public class MyDate {
	public int year;
	public int month;
	public int day;

	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public String toString() {
		return year + "/" + month + "/" + day;
	}
}
