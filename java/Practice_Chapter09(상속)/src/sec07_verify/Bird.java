package sec07_verify;

public class Bird extends Pet {

	String type;
	boolean flightYN;
	
	boolean getFlight() {
		
		return flightYN;	
	}
	void move() {
		System.out.println("새가 날아가네요");
	}

}
