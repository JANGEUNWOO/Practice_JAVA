package sec01_verify;

import java.util.Scanner;

public class Exercise5_1_switch {

	public static void main(String[] args) {
		
		int score;
		System.out.print("점수를 입력하세요 :  ");   
	    
		Scanner sc=new Scanner(System.in);
	    score=sc.nextInt();
	       
	       
	    switch ((int)(score/10)) {
	    case 9:
	     System.out.println("당신의 학점은 : A");
	     break;
	    case 8:
	     System.out.println("당신의 학점은 : B");
	     break;
	    case 7:
	     System.out.println("당신의 학점은 : C");
		 break;
	    case 6:
	     System.out.println("당신의 학점은 : D");
		 break;
	    	
	    	   
	       }
		
       sc.close();
	}

}
