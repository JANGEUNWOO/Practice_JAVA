package sec02_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int total=0;
		 String input=null;
		
		
		
		    while(true) {
			System.out.print("상품금액 입력:");
			input=sc.nextLine();
			
			if(input.equals("끝"))
			{
		      break;
		    }
	         else {
	    	   total=total+Integer.parseInt(input);
	        }
	            
		    }
		    System.out.println("구매하신 상품의 총가격은"+total+"입니다");
	            sc.close();
	       

	  }
}