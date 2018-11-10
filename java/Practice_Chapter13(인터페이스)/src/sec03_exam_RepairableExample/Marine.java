package sec03_exam_RepairableExample;

public class Marine extends GroundUnit {
    
	
	static int hitPoint;
    
    
	public Marine() {
		super(40);
		Marine.hitPoint=this.MAX_HP;
	}
	
}
