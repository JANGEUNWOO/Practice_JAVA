package sec05_verify;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle c=new Circle(1,2,10);
		Circle c1=new Circle(5,6,10);
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		if(c.equals(c1)) {
			System.out.println("�� 1�� �� 2�� ���� ���Դϴ�.");
		}else {
			System.out.println("�� 1�� �� 2�� ���� ���� �ƴմϴ�.");
		}
	}
}
