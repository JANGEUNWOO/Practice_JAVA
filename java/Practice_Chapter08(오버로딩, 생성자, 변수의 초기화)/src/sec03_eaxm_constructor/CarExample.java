package sec03_eaxm_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		//���� �ֹ��ؼ� �ڱⰡ ���� ���� �ٸ���, ��Ƶ� �����,
		//���� 4���� ����� ��!
		Car c1=new Car(); //Car�ν��Ͻ� ����
		
		/*
		 c1.color="white";
		 c1.gearType="auto";
		 c1.door=4;
		 */
		
		//���� �ֹ��� �� ����, ���, �������� �������ִ� ����
		Car c2=new Car("�Ķ�", "����", 0);//�Ű������� 3���� ������ ����
		
		//toString�ż��尡 ȣ���.
		System.out.println(c1);
		System.out.println(c2.toString());
	}

}
