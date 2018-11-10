package sec01_verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		int input=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>:");
		input=sc.nextInt();
		
		String[] a = new String[]{"50000", "10000", "5000","1000","100", "50", "10", "5", "1"};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.parseInt(a[i]);
		}
		
		int[] c=new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
		   if (b[i] <= input) {
                    c[i] = input/b[i];
                    input = input%b[i];  
			
				 }
	     System.out.println(b[i]+"원"+c[i]+"개");			 
					 }
	sc.close();
	} 
}