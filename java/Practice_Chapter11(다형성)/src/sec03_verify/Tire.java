package sec03_verify;

public class Tire {

	int maxRotation;          //�ִ� ȸ����(�ִ����)
	int accumulatedRotation;  //���� ȸ����
	String location;          //Ÿ�̾��� ��ġ
	
	Tire(String location, int maxRotation ) {
	this.location=location;
	this.maxRotation=maxRotation;

	}
	
	
	boolean roll() {
	++accumulatedRotation;
	if(accumulatedRotation<maxRotation) {
		System.out.println(location+"����:"+(maxRotation-accumulatedRotation)+"ȸ");
		return true;
	}else {
		System.out.println(location+"��ũ�����ϴ�.");
		return false;
	}
	}
	
	
	
	
	
}
