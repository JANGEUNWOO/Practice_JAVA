package sec04_verify;

public class RectExample {

	public static void main(String[] args) {
		
        Rect r1=new Rect(5,15);
		Rect r2=new Rect(15,5);
		Rect r3=new Rect(3,10);
		
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		if(r1.equals(r2)) {
			System.out.println("rect1�簢�� ������ rect2�簢�� ������ ����.");
		}else {
			System.out.println("rect1�簢�� ������ rect2�簢�� ������ ���� �ʽ��ϴ�.");
		}
		
		if(r2.equals(r3)) {
			System.out.println("rect2�簢�� ������ rect3�簢�� ������ ����.");
		}else {
			System.out.println("rect2�簢�� ������ rect3�簢�� ������ ���� �ʽ��ϴ�..");
		}

	}

}
