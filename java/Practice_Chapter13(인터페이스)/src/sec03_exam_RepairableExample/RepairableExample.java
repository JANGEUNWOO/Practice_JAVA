package sec03_exam_RepairableExample;

public class RepairableExample {

	public static void main(String[] args) {
		
		
		SCV scv=new SCV();
		Marine marine=new Marine();
		
		Tank tank=new Tank();
		tank.DamageUnit(tank, 100);
		scv.repair(tank);    //SCV�� tank�� �����ϵ��� �Ѵ�.
		
		System.out.println("------------------------------------");
		
		DropShip dropship=new DropShip();
		dropship.DamageUnit(dropship, 88);
		scv.repair(dropship);    //SCV�� DropShip�� �����ϵ��� �Ѵ�.
		
		System.out.println("------------------------------------");
		
		
		//Marine�� �� ���ܰ� �߻�? ������ ���� �������̽��� ��������...
		//scv.repair(marine);
		

	}

}
