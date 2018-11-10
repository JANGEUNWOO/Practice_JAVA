package sec03_verify;

public class HankookTire extends Tire {

	HankookTire(String location, int maxRotation){
		super(location,maxRotation);
	}
	
	
	
	@Override
	boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire¼ö¸í:"+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println(location+"ÆãÅ©³µ½À´Ï´Ù.");
			return false;
		}
		}
	
	
}
