package sec13_verify;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		
		ShopService obj1=ShopService.getInstance();
		
		ShopService obj2=ShopService.getInstance();
        
		System.out.println(obj1);
		System.out.println(obj2);
		//����� ���� Ŭ������ object�� equals()ȣ��--->���� ��
		
		if(obj1.equals(obj2))
				System.out.println("���� ShopService ��ü�Դϴ�.");
		else
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
	}
		

	}


