package sec03_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairable {

	
	static int hitPoint;
	
	//������
	
	public SCV() {
		super(60); //DropShip�� HP�� 60�̴�.
		System.out.println(this.toString()+"�� HP��"+this.MAX_HP+"�Դϴ�. ��~!");
		SCV.hitPoint=this.MAX_HP;
	}
	
	//Repairable�������̽��� ������ Ŭ������ �Ű������� ���ü��� ������ �ָ�!
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			int count=0;
			//Unit�� Ÿ���� �´ٸ� �ڼ�Ŭ����(Tank,DropShip�� UnitŸ������ ��������ȯ)
			Unit u=(Unit)r;
			System.out.println("���� ü��:"+u.hitPoint);     //���� ü���� ���;���..
			
			while(u.hitPoint!=u.MAX_HP) {
				//Unit�� HP�� ������Ų��.
				u.hitPoint++;
				count++;
			}
			System.out.println(u.toString()+"�� HP��"+count+"��ŭ ������ �������ϴ�.");
		}
	}
	
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	//�Ű�����Ÿ������ Repairable�������̽��� ���Դ�. �� �ǹ̴� �����ΰ�?
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		//Ÿ�� üũ�ϴ� ��
		if(r instanceof Unit) {
			
			Unit unit=(Unit)r;
			System.out.println(unit.toString()+"��"+Damage+"��ŭ �������� �Ծ����ϴ�!");
			System.out.println(unit.toString()+"�� ���� HP��"+(unit.MAX_HP-Damage));
			
			System.out.println(unit.toString()+"�� ������ �ʿ��մϴ� ��~!");
			
		}
		SCV.hitPoint-=Damage;     //ü�°���
	}
	
}
