package sec06_exam_annoymous_implements;

public class Annoymous {

	//�ʵ��� �ʱⰪ���� ���� ���
	RemoteControl field=new RemoteControl() {
		//�͸���Ŭ����
		@Override
		public void turnOn() {
			System.out.println("Tv�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("Tv�� �մϴ�.");
		}
	};
	
	void method1() {
		//���ú����� �������̽�Ÿ���� ������ �͸�����ü ����
		RemoteControl localVar=new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
	
	localVar.turnOn();
	localVar.turnOff();
	
	}
     //�Ű������� �������̽� Ÿ���� ���Դ�. ���ǹ̴�?
     void method2(RemoteControl rc) {
	         rc.turnOn();
	         rc.turnOff();
	
     }
}
