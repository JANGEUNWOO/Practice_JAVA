package sec01_verify;

import java.util.Scanner;

public class Exercise2_switch {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("월을 입력하시오.");
	    int month=sc.nextInt();
	    
	    
	    //3으로 나누어 보면 코드값을 줄일 수 있다!!
	    switch (month) { 
	         case 1:        
	         case 2:
	         case 3:
	        	 System.out.println(month+"월은 봄 입니다");
	        	 break;
	        	 
	         case 4:
	         case 5:
	         case 6:
	        	 System.out.println(month+"월은 여름 입니다");
	        	 break;
	        	 
	         case 7:
	         case 8:
	         case 9:
	        	 System.out.println(month+"월은 가을 입니다");
	             break;
	             
	         case 10:
	         case 11:
	         case 12:
	        	 System.out.println(month+"월은 겨울 입니다");
	        	 break;
	        
	        	 
	    }
	    
	  sc.close();
	    

	    }
	}



