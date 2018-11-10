package sec02_verify;

import java.util.Scanner;

public class Exercise06_1 {

	public static void main(String[] args) {
		
		
		boolean run=true;
		int speed=0;
		int keyCode=0;
		
	
		Scanner sc=new Scanner(System.in);
		
		
	    while(run) {
	    	System.out.println("------------------");
	    	System.out.println("1.증속|2.감속|3.중지");
	    	System.out.println("------------------");
	    	System.out.println("입력:");
	    	keyCode=sc.nextInt();
	     
	    if(keyCode==1) {
	       
           speed=speed+1;
	    	
	    	System.out.println("선택:"+keyCode+"현재속도:"+speed);
	        
	     } else if(keyCode==2) {
	    	     speed=speed-1;
	    	
		    System.out.println("선택:"+keyCode+"현재속도:"+speed);
	     } else if(keyCode==3) {
	    	 System.out.println("프로그램종료");
		     break;
	     }  
	    

	}
	sc.close();
	}
}
