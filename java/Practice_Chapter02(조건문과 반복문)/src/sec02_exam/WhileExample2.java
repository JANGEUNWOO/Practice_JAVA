package sec02_exam;

public class WhileExample2 {

	public static void main(String[] args) {
		
		int sum=0;
		int j=1;
		
		//j가 100될때까지
		while(j<=100) {
			sum+=j; //값을 계속 누적을 시키고 있음
			j++;
		}
		
		System.out.println("1~"+(j-1)+"합:"+sum);
		
	}

}
