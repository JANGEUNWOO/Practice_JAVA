package sec07_verify;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {
	    
		
		for(int i=0;i<4;i++) {
		  try {
			System.out.println("0~100 ������ ������ �Է��ϼ���(���Ḧ ���ϸ� -1�� �Է�)");
			Scanner scanner=new Scanner(System.in);
		    int score=scanner.nextInt();
			doSomething(score);
		  }catch(MyException a) {
			System.out.println("score���� ����(0 <= x <= 100)�� �ʰ��Ͽ����ϴ�.");
			System.out.println("���ܰ� �߻�������, ���α׷� ���� ����");
		  }
		}
	}

	private static void doSomething(int score) throws MyException {
		       
		
		       if(score>=0 && score<=100) {
		    	   System.out.println("�Է��� ������"+score+"�Դϴ�.");
		         }else if(score==-1){
		           System.out.println("-1�� �Է��ϼ̱��� ���α׷��� �����մϴ�.");
		         }else {
		           throw new MyException(score);
		         }
	}
		
}

