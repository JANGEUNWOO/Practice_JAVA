package sec07_verify;

public class PetExample {

	

	public static void main(String[] args) {
		
		
		Dog D=new Dog();
		Bird B=new Bird();
		D.move();
		B.move();
		D.name="������";
		D.weight=10;
		System.out.println("�������� �̸��� "+D.name+"��, �����Դ� "+D.weight+"kg�Դϴ�.");
		
		B.type="�޹���";
		B.flightYN=true;
		
		if(B.getFlight()) {
			System.out.println("���� ������ "+B.type+"��, �����ֽ��ϴ�.");
		}else {
			System.out.println("���� ������ "+B.type+"��, ���������ϴ�.");
		}
	}

}
