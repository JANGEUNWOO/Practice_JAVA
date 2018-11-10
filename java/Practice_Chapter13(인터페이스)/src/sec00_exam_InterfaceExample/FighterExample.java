package sec00_exam_InterfaceExample;

public class FighterExample {

	public static void main(String[] args) {
	
		//Fightable f=new Fightable();
		//Unit f=new Fighter();     //������ �׷�����
		Fighter f= new Fighter();
		
		/*A instanceof B ��: A�� BŸ���� ��� true�� ��ȯ�Ѵ�.
		��, A�� B�� ����ȯ�ȴٴ� �ǹ��̴�.(����Ŭ������ ���̴�.)
		�������� ������ ���÷� ����.(����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ִ� ��.)*/
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f�� Moveable�������̽��� �����߽��ϴ�.");
			
		}
		if(f instanceof Moveable) {
			System.out.println("f�� Moveable�������̽��� �����߽��ϴ�.");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
			
		}
		//�����ǵ� �߻�ż��� ȣ��
		f.move(0, 0);
		f.attack(null);
		
	}

}
