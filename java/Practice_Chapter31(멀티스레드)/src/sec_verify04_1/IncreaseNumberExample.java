package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {

		IncreaseNumberThread a1 = new IncreaseNumberThread(new Number());
		a1.setName("FIRST");
		a1.start();
		
		IncreaseNumberThread a2 = new IncreaseNumberThread(new Number());
	    a2.setName("SECOND");
		a2.start();
		
		IncreaseNumberThread a3 = new IncreaseNumberThread(new Number());
		a3.setName("THIRD");
		a3.start();

	}

}
