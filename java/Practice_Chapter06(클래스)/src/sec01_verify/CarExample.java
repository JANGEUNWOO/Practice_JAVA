package sec01_verify;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.setCompany("������");
		System.out.println("����ȸ��: "+car1.getCompany());
		
		car1.setCar("�׷���");
		System.out.println("��: "+car1.getCar());
		
		car1.setColor("����");
		System.out.println("����: "+car1.getColor());
		
		car1.setMaxSpeed(350);
		System.out.println("�ְ�ӵ�: "+car1.getMaxSpeed());
		
		car1.setNowSpeed(0);
		System.out.println("����ӵ�: "+car1.getNowSpeed());
		
		car1.setFixedSpeed(60);
		System.out.println("�����ȼӵ�: "+car1.getFixedSpeed());
		
		

	}

}
