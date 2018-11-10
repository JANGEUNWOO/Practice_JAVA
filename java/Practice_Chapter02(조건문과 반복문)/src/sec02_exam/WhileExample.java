package sec02_exam;

public class WhileExample {

	public static void main(String[] args) {
		
		int i=1;
		//1~10까지 콘솔에 출력
		//while문은 보통 무한 루프돌때 많이 사용
		//무한루프를 탈출할 조건문이 반드시 존재해야 함
		while(true) {
			if(i>=11)
			break;
			
			System.out.println(i);
			i++;
		}
		
		
	}

}
