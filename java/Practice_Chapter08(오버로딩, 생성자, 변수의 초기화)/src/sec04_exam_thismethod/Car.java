package sec04_exam_thismethod;

public class Car {

	

		
		String color;  //����
		String gearType; //���ӱ� ����>auto, manual
		int door;
		
		//�⺻������
		//�����ڰ� �������� ���� ���� �׻� �����ε��� ��Ģ�� ����� �Ѵٴ� ���� �ָ�����.
		
		public Car() {
			this("white","auto",4);
			System.out.println("�⺻������ ȣ��"); //�Ű������� 3���� ������ ȣ��
			
		}
		
		public Car(String color) {
			this(color, "auto", 4); //color���� ������ �Ű����� 3���� ������ ȣ��
		}
		
		public Car(String color, String gearType) {
			this(color, gearType, 4);
		}
		
		//�Ű������� �ִ� ������
		public Car(String color, String gearType, int door) {
			this.color=color;
			this.gearType=gearType;
			this.door=door;
			
			
		}
		@Override
		public String toString() {
			String str="����"+this.color+",���Ÿ��"+
			      this.gearType+", �� ����="+this.door;
			   return str;
	
	}
		
}
	
	

