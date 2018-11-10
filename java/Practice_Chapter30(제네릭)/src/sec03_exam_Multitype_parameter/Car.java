package sec03_exam_Multitype_parameter;

public class Car {

	private String brand;
	private int year;
	private int month;

	public Car() {
	}

	public Car(String brand, int year, int month) {
		this.brand = brand;
		this.year = year;
		this.month = month;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand=brand;
	}

	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
