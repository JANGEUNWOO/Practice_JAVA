package sec02_verify;

import java.util.Scanner;

public class Exercise12_1 {

	public static void main(String[] args) {
		
		
        Scanner sc=new Scanner(System.in);
        
        
        for(int line=sc.nextInt();line>= 1	;line--)
        {
        	System.out.println();
            for(int star=1;  line>=star ;star++)
               {
                 System.out.print("*");
               }
            
                
            }

      sc.close();
      

	}

}
