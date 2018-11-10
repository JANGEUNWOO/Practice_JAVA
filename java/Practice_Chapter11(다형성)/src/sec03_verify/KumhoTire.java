package sec03_verify;

public class KumhoTire extends Tire {

	KumhoTire(String location,int maxRotation){
	super(location,maxRotation);
	
	}

	
	@Override
	boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"kunmho Tire¼ö¸í:"+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println(location+"ÆãÅ©³µ½À´Ï´Ù.");
			return false;
		}
		}
	}
