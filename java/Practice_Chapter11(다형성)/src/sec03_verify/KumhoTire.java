package sec03_verify;

public class KumhoTire extends Tire {

	KumhoTire(String location,int maxRotation){
	super(location,maxRotation);
	
	}

	
	@Override
	boolean roll() {
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"kunmho Tire����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"��ũ�����ϴ�.");
			return false;
		}
		}
	}
