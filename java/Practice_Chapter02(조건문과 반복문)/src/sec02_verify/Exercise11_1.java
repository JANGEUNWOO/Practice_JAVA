package sec02_verify;

import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		
		
		
		
		
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int n1=1;
		int n2=1;
		int n3=1;
       
		for(int i=0;n3<input;i++) {
			
			if(i<2) {
			    n3=1;
			} else { 
			n3=n1+n2;
			n1=n2;
			n2=n3;
			}
		    if(n3<input) {
		    	System.out.println(n3);
		    }
		}
		
		//an = a(n-1) + a(n-2) 피보나치
	   
		sc.close();

	}

}
