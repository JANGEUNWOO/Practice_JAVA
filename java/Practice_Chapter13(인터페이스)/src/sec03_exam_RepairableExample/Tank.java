package sec03_exam_RepairableExample;

public class Tank extends GroundUnit implements Repairable {

	
	//static int hitPoint;
	//������
	
	public Tank() {
		super(150); //DropShip�� HP�� 150�̴�.
		System.out.println(this.toString()+"�� HP��"+this.MAX_HP+"�Դϴ�. ��~!");
		super.hitPoint=this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
	
	//�Ű�����Ÿ������ Repairable�������̽��� ���Դ�. �� �ǹ̴� �����ΰ�?
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		//Ÿ�� üũ�ϴ� ��
		if(r instanceof Unit) {
			
			Unit unit=(Unit)r;
			System.out.println(unit.toString()+"��"+Damage+"��ŭ �������� �Ծ����ϴ�!");
			System.out.println(unit.toString()+"�� ������ �ʿ��մϴ� ��~!");
			super.hitPoint-=Damage;
		}
		  
	}
	
}
