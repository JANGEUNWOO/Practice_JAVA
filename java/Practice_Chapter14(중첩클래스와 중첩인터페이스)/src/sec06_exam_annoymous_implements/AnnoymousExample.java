package sec06_exam_annoymous_implements;

public class AnnoymousExample {

	public static void main(String[] args) {
		
		
		//Annoymous�� �ν��Ͻ� ����
		Annoymous annoy=new Annoymous();
		
		//annoy�ν��Ͻ��� �ִ� �͸�����ü�� �������̵� �޼��� ȣ��
		annoy.field.turnOn();
		annoy.field.turnOff();
		annoy.method1();
		
		//�Ű������� �������̽�Ÿ���� ���ȼ� �ٷ� �͸�����ü�� �����ؿ� ����
		annoy.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����Ʈ Tv�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("����Ʈ Tv�� ���ϴ�.");
				
			}
		});

	}

}
