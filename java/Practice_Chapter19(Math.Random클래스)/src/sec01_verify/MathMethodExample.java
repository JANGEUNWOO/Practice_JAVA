package sec01_verify;

import java.util.Random;

public class MathMethodExample {

	public static void main(String[] args) {
		
		
		double number = -2.78987434;
		
		System.out.println("number�� ���밪 : "+Math.abs(number));
		System.out.println("number�� �ø��� : "+Math.ceil(number));
		System.out.println("number�� ������ : "+Math.floor(number));
		System.out.println("9.0 �� ������ : "+Math.sqrt(9.0));
		System.out.println("PI�� ����� ���� : "+Math.rint(Math.PI));
		
	    System.out.print("�̹��� ����� �ζ� ��ȣ�� ");
	    int[] lotto=new int[6];    
	    for(int i=0;i<lotto.length;i++) {
			
	    	lotto[i]=(int)((Math.random()*45)+1);
			  
			  
			  for(int j=i-1;j>=0;j--) {
				  if(lotto[i]==lotto[j]) {
					  i--;
					  break;
				  }//�ߺ��� ����
			  }
		}
	    
	    for(int i=0;i<lotto.length;i++) {
	    	System.out.print(lotto[i]+" ");
	    }
		System.out.println("�Դϴ�.");
	}

}
