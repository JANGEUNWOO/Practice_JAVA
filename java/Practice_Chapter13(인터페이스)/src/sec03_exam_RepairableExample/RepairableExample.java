package sec03_exam_RepairableExample;

public class RepairableExample {

	public static void main(String[] args) {
		
		
		SCV scv=new SCV();
		Marine marine=new Marine();
		
		Tank tank=new Tank();
		tank.DamageUnit(tank, 100);
		scv.repair(tank);    //SCV가 tank를 수리하도록 한다.
		
		System.out.println("------------------------------------");
		
		DropShip dropship=new DropShip();
		dropship.DamageUnit(dropship, 88);
		scv.repair(dropship);    //SCV가 DropShip을 수리하도록 한다.
		
		System.out.println("------------------------------------");
		
		
		//Marine은 왜 예외가 발생? 마린은 수리 인터페이스를 구현안함...
		//scv.repair(marine);
		

	}

}
