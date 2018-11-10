package sec04_verify;

abstract public class Printer {

	static int USB;
	static int PARALLEL;
	private String modelName;
	private String manufacturer;
	private int type;  //USB 또는 병렬프린터
	protected int numberOfPrinted; //인쇄한 종이 매수
	protected int numberOfPaper; //남은 종이 매수
	
	Printer(String modelName,String manufacturer,int numberOfPrinted,int numberOfPaper){
		this.modelName=modelName;
		this.manufacturer=manufacturer;
		this.numberOfPrinted=numberOfPrinted;
		this.numberOfPaper=numberOfPaper;
	}
	
	String getModelName() {
		return manufacturer;
	}
	
	String getManufacturer() {
		return manufacturer;
	}
	
	int getType() {
		return numberOfPaper;
	}
	int getNumberOfPrinted() {
		return numberOfPaper;
	}
	int getNumberOfPaper() {
		return numberOfPaper;
	}
	
	void setNumberOfPaper(int numberOfPaper) {
	 this.numberOfPaper=numberOfPaper;

	}
	
	abstract public boolean print();
	
	
}
