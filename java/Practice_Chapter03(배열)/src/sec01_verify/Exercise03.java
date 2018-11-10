package sec01_verify;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		

		
	    
	    
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("¿ä¼Ò ¼ö : 4 ");
	    
	   
	    int[] num=new int[4] ;
		
	    
	    for(int i=0;i<num.length;i++) {
	    	int count=sc.nextInt();
	    	num[i]=count;
	    		
	    	System.out.println("num["+i+"]="+count);
	         
	    }
	    
	    System.out.println("num="+Arrays.toString(num));
    
	    
	    
	  sc.close();
	}
	
	
}
