package sec03_verify;

public class EqualsExample {

	public static void main(String[] args) {
		
		
		Point num1=new Point(2,3);
		Point num2=new Point(2,3);
		Point num3=new Point(3,10);
		
		
		System.out.println("Point num1의 필드값: "+num1);
		System.out.println("Point num2의 필드값: "+num2);
		System.out.println("Point num3의 필드값: "+num3);
		
		if(num1.equals(num2)) {
			System.out.println("num1의 필드와 num2의 필드는 같다.");
		}else {
			System.out.println("num1의 필드와 num2의 필드는 같지 않습니다.");
		}
	}

}
