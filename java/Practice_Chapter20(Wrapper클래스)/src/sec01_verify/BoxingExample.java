package sec01_verify;

public class BoxingExample {

	public static void main(String[] args) {
		
		//i�� �ڵ� �ڽ���  intObject�� �� :  10
		//intObject�� i�� �ڵ���ڽ��� �� : 20

		
		Integer intobj=new Integer(10);
		System.out.println("i�� �ڵ� �ڽ���  intObject�� �� : "+intobj);
		
		Integer i=intobj.intValue()+10;
		System.out.println("intObject�� i�� �ڵ���ڽ��� �� :"+i);
			
	}
}
