package sec04_verify;

public class InkjetPrinter extends Printer {

	static final int amountOfInkToPrint=5;
	private int amountOfInk;
	
	InkjetPrinter(String modelName,String manufacturer,int amountOfInk,int numberOfPrinted,int numberOfPaper){
		super(modelName,manufacturer,numberOfPrinted,numberOfPaper);
	    this.amountOfInk=amountOfInk;
	}
	
	
	int getAmountOfInk() {
		return amountOfInkToPrint-numberOfPrinted*numberOfPaper;
	}
	
	public boolean print() {
		if(numberOfPrinted*numberOfPaper<=amountOfInkToPrint) {
			return true;
		} else {
			return false;
		}

	}
}
