package sec01_verify;

import java.util.Scanner;

public class Exercise2_switch {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�.");
	    int month=sc.nextInt();
	    
	    
	    //3���� ������ ���� �ڵ尪�� ���� �� �ִ�!!
	    switch (month) { 
	         case 1:        
	         case 2:
	         case 3:
	        	 System.out.println(month+"���� �� �Դϴ�");
	        	 break;
	        	 
	         case 4:
	         case 5:
	         case 6:
	        	 System.out.println(month+"���� ���� �Դϴ�");
	        	 break;
	        	 
	         case 7:
	         case 8:
	         case 9:
	        	 System.out.println(month+"���� ���� �Դϴ�");
	             break;
	             
	         case 10:
	         case 11:
	         case 12:
	        	 System.out.println(month+"���� �ܿ� �Դϴ�");
	        	 break;
	        
	        	 
	    }
	    
	  sc.close();
	    

	    }
	}



