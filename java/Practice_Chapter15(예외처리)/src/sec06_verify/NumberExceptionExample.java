package sec06_verify;

public class NumberExceptionExample {

	public static void main(String[] args) {
		
		
		String[] stringNumber = {"23", "12", "998", "java"};
		
		try {
		  for(int i=0;i<stringNumber.length;i++) {
			System.out.println(Integer.parseInt(stringNumber[i]));
		  }
		}catch(NumberFormatException e) {
			System.out.println("���� �߻� : ������ ��ȯ�� �� �����ϴ�."+e);
		}
		

	}

}
