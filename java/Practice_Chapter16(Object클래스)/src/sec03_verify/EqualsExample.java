package sec03_verify;

public class EqualsExample {

	public static void main(String[] args) {
		
		
		Point num1=new Point(2,3);
		Point num2=new Point(2,3);
		Point num3=new Point(3,10);
		
		
		System.out.println("Point num1�� �ʵ尪: "+num1);
		System.out.println("Point num2�� �ʵ尪: "+num2);
		System.out.println("Point num3�� �ʵ尪: "+num3);
		
		if(num1.equals(num2)) {
			System.out.println("num1�� �ʵ�� num2�� �ʵ�� ����.");
		}else {
			System.out.println("num1�� �ʵ�� num2�� �ʵ�� ���� �ʽ��ϴ�.");
		}
	}

}
