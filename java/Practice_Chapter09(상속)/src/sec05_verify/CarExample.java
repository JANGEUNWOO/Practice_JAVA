package sec05_verify;

public class CarExample {

	public static void main(String[] args) {
		
		Sedan se=new Sedan();
		se.color="�����";
		se.speed=300;
		se.seatNum=5;
		System.out.println(se.toString());
		
		Truck tr=new Truck();
		tr.color="�Ķ���";
		tr.speed=100;
		tr.capacity=50;
		System.out.println(tr.toString());

	}

}
