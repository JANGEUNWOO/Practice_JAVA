package sec03_verify;

public class HankookTire extends Tire {

	HankookTire(String location, int maxRotation){
		super(location,maxRotation);
	}
	
	
	
	@Override
	boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"��ũ�����ϴ�.");
			return false;
		}
		}
	
	
}
