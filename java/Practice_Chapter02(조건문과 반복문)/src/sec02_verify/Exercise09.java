package sec02_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int total=0;
		 String input=null;
		
		
		
		    while(true) {
			System.out.print("��ǰ�ݾ� �Է�:");
			input=sc.nextLine();
			
			if(input.equals("��"))
			{
		      break;
		    }
	         else {
	    	   total=total+Integer.parseInt(input);
	        }
	            
		    }
		    System.out.println("�����Ͻ� ��ǰ�� �Ѱ�����"+total+"�Դϴ�");
	            sc.close();
	       

	  }
}