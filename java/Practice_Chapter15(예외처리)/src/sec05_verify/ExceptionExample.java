package sec05_verify;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		int a=220;
		int b=0;
		
		try {
			System.out.println("�������� �Է��Ͻÿ�:"+a);
			System.out.println("�������� �Է��Ͻÿ�:"+b);
			int c=a/b;
		}catch(Exception e){
			System.out.println("���� �߻� : 0���� ���� �� �����ϴ�.");
		}

	}

}
