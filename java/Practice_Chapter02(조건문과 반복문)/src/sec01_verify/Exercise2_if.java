package sec01_verify;

import java.util.Scanner;

public class Exercise2_if {

	public static void main(String[] args) {
		 
		int month=(int)(Math.random()*4)+1;
		System.out.print("���� �Է��Ͻÿ�.");
		Scanner sc=new Scanner(System.in);
		
	    month=sc.nextInt();
	    
	    
	    if (month<4) {
	    	System.out.println(month+"���� ���Դϴ�.");
	    } else if (month<7) {
	    	System.out.println(month+"���� �����Դϴ�.");
	    }	else if (month<10) {
	    		System.out.println(month+"���� �����Դϴ�.");
	    }  else {
	    	System.out.println(month+"���� �ܿ��Դϴ�.");
	    }
	    sc.close();
	    
	 }

}
