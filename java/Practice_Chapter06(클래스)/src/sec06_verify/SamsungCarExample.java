package sec06_verify;

public class SamsungCarExample {

	public static void main(String[] args) {
        SamsungCar sc=new SamsungCar();
		
		sc.setCompany("Samsung");
		sc.setColor("While");
		sc.setModel("SM5");
		sc.setMaxSpeed(240);
		sc.setSpeed(-10);
		
		if(sc.getCompany()!="hyundai") {
			System.out.println("�Ｚ���� �ƴմϴ�.");
		}
		
		if(sc.getModel()!="sonate") {
			System.out.println("�Ｚ�� ���� �ƴմϴ�.");
		}
		
		if(sc.getSpeed()<0) {
			sc.SpeedDown();
		}
		
		
		
		
		System.out.println(sc);

	}

}
