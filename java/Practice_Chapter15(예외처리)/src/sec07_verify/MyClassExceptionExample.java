package sec07_verify;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {
	    
		
		for(int i=0;i<4;i++) {
		  try {
			System.out.println("0~100 사이의 정수를 입력하세요(종료를 원하면 -1을 입력)");
			Scanner scanner=new Scanner(System.in);
		    int score=scanner.nextInt();
			doSomething(score);
		  }catch(MyException a) {
			System.out.println("score값이 범위(0 <= x <= 100)를 초과하였습니다.");
			System.out.println("예외가 발생했지만, 프로그램 정상 종료");
		  }
		}
	}

	private static void doSomething(int score) throws MyException {
		       
		
		       if(score>=0 && score<=100) {
		    	   System.out.println("입력한 정수는"+score+"입니다.");
		         }else if(score==-1){
		           System.out.println("-1을 입력하셨군요 프로그램을 종료합니다.");
		         }else {
		           throw new MyException(score);
		         }
	}
		
}

