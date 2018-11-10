package sec04_verify;

public class LaserPrinter extends Printer {

	
	static final int amountOfTonerToPrint=10;
	private int amountOfToner;
	
	LaserPrinter(String modelName, String manufacturer,int amountOfToner,int numberOfPrinted,int numberOfPaper){
		super(modelName,manufacturer,numberOfPrinted,numberOfPaper);
		this.amountOfToner=amountOfToner;
	}
	
	int getAmountOfToner() {
		return amountOfTonerToPrint-numberOfPrinted*numberOfPaper;
	}
	
	public boolean print() {
		if(numberOfPrinted*numberOfPaper<=amountOfTonerToPrint) {
			return true;
		} else {
			return false;
		}

	}
}
