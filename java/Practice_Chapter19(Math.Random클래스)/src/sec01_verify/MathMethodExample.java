package sec01_verify;

import java.util.Random;

public class MathMethodExample {

	public static void main(String[] args) {
		
		
		double number = -2.78987434;
		
		System.out.println("number의 절대값 : "+Math.abs(number));
		System.out.println("number의 올림값 : "+Math.ceil(number));
		System.out.println("number의 내림값 : "+Math.floor(number));
		System.out.println("9.0 의 제곱근 : "+Math.sqrt(9.0));
		System.out.println("PI의 가까운 정수 : "+Math.rint(Math.PI));
		
	    System.out.print("이번주 행운의 로또 번호는 ");
	    int[] lotto=new int[6];    
	    for(int i=0;i<lotto.length;i++) {
			
	    	lotto[i]=(int)((Math.random()*45)+1);
			  
			  
			  for(int j=i-1;j>=0;j--) {
				  if(lotto[i]==lotto[j]) {
					  i--;
					  break;
				  }//중복값 제거
			  }
		}
	    
	    for(int i=0;i<lotto.length;i++) {
	    	System.out.print(lotto[i]+" ");
	    }
		System.out.println("입니다.");
	}

}
