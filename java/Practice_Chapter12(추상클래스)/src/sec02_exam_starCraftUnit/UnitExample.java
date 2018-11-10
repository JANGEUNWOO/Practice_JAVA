package sec02_exam_starCraftUnit;

public class UnitExample {

	public static void main(String[] args) {
		
		
		
		//Unit unit=new Unit(); //에러난다. 이유는?추상클래스는 인스턴스를 생성못한다..
		System.out.println("--------------------------");
		Tank tank=new Tank();
		tank.move(100, 300);
		tank.sizeMode();
		tank.stop("탱크", 300, 400);
		
		System.out.println("--------------------------");
		
		Marine marine=new Marine();
		marine.move(200, 500);
		marine.stimPack();
		marine.stop("마린", 300, 400);
		
		System.out.println("--------------------------");
		
		DropShip dp=new DropShip();
		dp.move(500, 600);
		dp.load();
		dp.unload();
		dp.stop("드랍십", 200, 100);
		
		System.out.println("--------------------------");
	
	}

}
