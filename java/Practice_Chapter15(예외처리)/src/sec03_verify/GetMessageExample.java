package sec03_verify;

public class GetMessageExample {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		
		
		try {
			int c=a/b;
		}
		
		 catch(ArithmeticException e) {
			 System.out.println("�߻� ������ �޽����� ����մϴ�. ==>"+e.getMessage());
		 }
	}

}
