package sec05_verify;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		int a=220;
		int b=0;
		
		try {
			System.out.println("나뉨수를 입력하시오:"+a);
			System.out.println("나눗수를 입력하시오:"+b);
			int c=a/b;
		}catch(Exception e){
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}

	}

}
