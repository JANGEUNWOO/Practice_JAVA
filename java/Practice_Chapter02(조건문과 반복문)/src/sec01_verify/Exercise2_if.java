package sec01_verify;

import java.util.Scanner;

public class Exercise2_if {

	public static void main(String[] args) {
		 
		int month=(int)(Math.random()*4)+1;
		System.out.print("월을 입력하시오.");
		Scanner sc=new Scanner(System.in);
		
	    month=sc.nextInt();
	    
	    
	    if (month<4) {
	    	System.out.println(month+"월은 봄입니다.");
	    } else if (month<7) {
	    	System.out.println(month+"월은 여름입니다.");
	    }	else if (month<10) {
	    		System.out.println(month+"월은 가을입니다.");
	    }  else {
	    	System.out.println(month+"월은 겨울입니다.");
	    }
	    sc.close();
	    
	 }

}
