package sec01_verify;

import java.util.Scanner;

public class Exercise5_1_switch {

	public static void main(String[] args) {
		
		int score;
		System.out.print("������ �Է��ϼ��� :  ");   
	    
		Scanner sc=new Scanner(System.in);
	    score=sc.nextInt();
	       
	       
	    switch ((int)(score/10)) {
	    case 9:
	     System.out.println("����� ������ : A");
	     break;
	    case 8:
	     System.out.println("����� ������ : B");
	     break;
	    case 7:
	     System.out.println("����� ������ : C");
		 break;
	    case 6:
	     System.out.println("����� ������ : D");
		 break;
	    	
	    	   
	       }
		
       sc.close();
	}

}
