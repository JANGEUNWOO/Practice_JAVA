package sec03_exam_RepairableExample;

public class Tank extends GroundUnit implements Repairable {

	
	//static int hitPoint;
	//생성자
	
	public Tank() {
		super(150); //DropShip의 HP는 150이다.
		System.out.println(this.toString()+"의 HP는"+this.MAX_HP+"입니다. 생~!");
		super.hitPoint=this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
	
	//매개변수타입으로 Repairable인터페이스가 들어왔다. 이 의미는 무엇인가?
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		//타입 체크하는 부
		if(r instanceof Unit) {
			
			Unit unit=(Unit)r;
			System.out.println(unit.toString()+"가"+Damage+"만큼 데미지를 입었습니다!");
			System.out.println(unit.toString()+"의 수리가 필요합니다 쌩~!");
			super.hitPoint-=Damage;
		}
		  
	}
	
}
