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
	    	System.out.println("1.����|2.����|3.����");
	    	System.out.println("------------------");
	    	System.out.println("�Է�:");
	    	keyCode=sc.nextInt();
	     
	    if(keyCode==1) {
	       
           speed=speed+1;
	    	
	    	System.out.println("����:"+keyCode+"����ӵ�:"+speed);
	        
	     } else if(keyCode==2) {
	    	     speed=speed-1;
	    	
		    System.out.println("����:"+keyCode+"����ӵ�:"+speed);
	     } else if(keyCode==3) {
	    	 System.out.println("���α׷�����");
		     break;
	     }  
	    

	}
	sc.close();
	}
}
