package sec13_verify;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		
		ShopService obj1=ShopService.getInstance();
		
		ShopService obj2=ShopService.getInstance();
        
		System.out.println(obj1);
		System.out.println(obj2);
		//사용자 정의 클래스의 object의 equals()호출--->번지 비교
		
		if(obj1.equals(obj2))
				System.out.println("같은 ShopService 객체입니다.");
		else
			System.out.println("다른 ShopService 객체입니다.");
	}
		

	}


